package swaglab.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglab.model.swaglabuser;
import swaglab.tasks.authentication.LoginWithInvalidCreds;
import swaglab.tasks.authentication.LoginWithValidCreds;

public class LoginStepDefinitionsWithInvalidCreds {
    @When("{actor} logs in with invalid credentials")
    public void logsInWithInvalidCredentials(Actor actor) {
        actor.attemptsTo(
                LoginWithInvalidCreds.asA(swaglabuser.LOCKEDUSER));
    }
    @Then("{actor} should be locked out from the product catalogue")
    public void shouldBeLockedOutFromTheProductCatalogue(Actor actor) {

        //Locked out from products
        actor.attemptsTo(
                Ensure.that(Text.of("[data-test='error']")).isEqualTo("Epic sadface: Sorry, this user has been locked out.")
        );

    }
}
