package interactions;

import io.restassured.http.ContentType;
import models.TestData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecuteGet implements Interaction {

    private final String resource;

    public ExecuteGet(String resource) {
        this.resource = resource;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(
                Get.resource(resource)
                        .with(request -> request.contentType(ContentType.JSON)
                                .params(TestData.getData())
                                .relaxedHTTPSValidation().log().all())
        );
    }
    public static ExecuteGet service(String resource) {
        return Tasks.instrumented(ExecuteGet.class,resource);
    }

}
