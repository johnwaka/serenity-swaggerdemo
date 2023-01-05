package swaglab.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglab.model.swaglabuser;
import swaglab.tasks.authentication.LoginWithValidCreds;
import swaglab.tasks.navigation.Navigate;


public class LoginStepDefinitionsWithValidCreds {

    @Given("{actor} is on login page")
    public void on_login_page(Actor actor) {
        //Access to the website login page
        actor.attemptsTo(
                Navigate.toTheLoginPage()
        );

    }
    @When("{actor} logs in with valid credentials")
    public void logs_in_with_valid_credentials(Actor actor) {
        // actor enters valid credentials in the username and password fields
        //Store credentials for a valid user.
          actor.attemptsTo(
                  LoginWithValidCreds.asA(swaglabuser.STANDARDUSER));
//        actor.attemptsTo(
//                Enter.theValue("standard_user").into("#user-name"),
//                Enter.theValue("secret_sauce").into("#password"),
//                Click.on(Button.withNameOrId("login-button"))
//        );
    }
    @Then("{actor} should be presented with a product catalogue")
    public void should_be_presented_with_a_product_catalogue(Actor actor) {
        // actor should be presented with the products catalogue with a list of products
        actor.attemptsTo(
                Ensure.that(Text.of(".title")).isEqualTo("PRODUCTS")
        );

    }
}
