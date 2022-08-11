package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.StatusCode;
import questions.TheQuantityFieldsService;
import questions.TheSchemaIs;
import questions.TheSchemaJson;
import tasks.ConsumeGet;
import tasks.Load;
import utils.resources.WebServiceEndpoints;

import java.util.List;
import java.util.Map;

public class GetStepDefinitions {

    @Given("I Load customer information")
    public void iLoadCustomerInformation(List<Map<String,String>> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Load.testData(data.get(0))
        );
    }

    @When("I call get user api")
    public void iCallGetUserApi() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(
                        WebServiceEndpoints.URI.getUrl()
                )
        );
    }
    @Then("I should see the status code {int}")
    public void iShouldSeeTheStatusCode(int responseCode) {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(StatusCode.is(responseCode)));
    }
    @Then("I validate quantity key is {int}")
    public void iValidateQuantityKeyIs(int quantity) {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(TheQuantityFieldsService.are(quantity)));
    }
    @Then("I validate schema response {string}")
    public void iValidateSchemaResponse(String schemaResponse) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheSchemaIs.expected(schemaResponse)));

        /*OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(TheSchemaJson.is(schemaResponse)));*/
    }
    @Then("I validate fields get response api")
    public void iValidateFieldsGetResponseApi() {

    }
    @Then("I validate get response contain data expected")
    public void iValidateGetResponseContainDataExpected() {

    }
}
