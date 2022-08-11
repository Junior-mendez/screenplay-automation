package questions;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

public class TheSchemaJson implements Question {

    private final String jsonSchema;

    public TheSchemaJson(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Validate Json Schema",
                        response->response.assertThat()
                                .contentType(ContentType.JSON)
                )
        );
        return true;
    }

    public static TheSchemaJson is(String jsonSchema) {
        return new TheSchemaJson(jsonSchema);
    }
}
