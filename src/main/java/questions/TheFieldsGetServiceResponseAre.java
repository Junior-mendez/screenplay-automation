package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheFieldsGetServiceResponseAre implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse(
                        "Validate flieds get service api response exists",
                        response-> response.assertThat()
                                .body("$", Matchers.hasKey("data"))
                                .and().body("data", Matchers.hasKey("id"))
                                .and().body("data", Matchers.hasKey("email"))
                                .and().body("data", Matchers.hasKey("first_name"))
                                .and().body("data", Matchers.hasKey("last_name"))
                                .and().body("data", Matchers.hasKey("avatar"))
                                .and().body("$", Matchers.hasKey("support"))
                                .and().body("support", Matchers.hasKey("url"))
                                .and().body("support", Matchers.hasKey("text"))
                )
        );
        return true;
    }
    public static TheFieldsGetServiceResponseAre expected() {
        return new TheFieldsGetServiceResponseAre();
    }
}
