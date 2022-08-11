package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheFieldsAndValuesGetResponseAre implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse(
                        "Validate Fields and Values Response Get Service",
                        response->response.assertThat()
                                .body("data.id", Matchers.equalTo(1))
                                .and().body("data.email", Matchers.equalTo("george.bluth@reqres.in"))
                                .and().body("data.first_name", Matchers.equalTo("George"))
                                .and().body("data.last_name", Matchers.equalTo("Bluth"))
                                .and().body("data.avatar", Matchers.equalTo("https://reqres.in/img/faces/1-image.jpg"))
                                .and().body("support.url", Matchers.equalTo("https://reqres.in/#support-heading"))
                                .and().body("support.text", Matchers.equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"))
                )
        );
        return true;
    }
    public static TheFieldsAndValuesGetResponseAre expected() {
        return new TheFieldsAndValuesGetResponseAre();
    }
}
