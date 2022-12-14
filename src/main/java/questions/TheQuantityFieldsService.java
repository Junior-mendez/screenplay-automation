package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheQuantityFieldsService implements Question {

    private final int quantity;

    public TheQuantityFieldsService(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Validation quantity fields service response",
                        response->response.assertThat()
                                .body("size()", Matchers.is(quantity)))
        );
        return true;
    }

    public static TheQuantityFieldsService are(int quantity) {
        return new TheQuantityFieldsService(quantity);
    }
}
