package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.Button;



public class AuthenticationStepDefinitions {

    @Given("{actor} is on login page")
    public void on_login_page(Actor actor) {
        //Access to the website login page
        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));

    }
    @When("{actor} logs in with valid credentials")
    public void logs_in_with_valid_credentials(Actor actor) {
        // actor enters valid credentials in the username and password fields
        actor.attemptsTo(
                Enter.theValue("standard_user").into("#user-name"),
                Enter.theValue("secret_sauce").into("#password"),
                Click.on(Button.withNameOrId("login-button"))
        );
    }
    @Then("{actor} should be presented with a product catalogue")
    public void should_be_presented_with_a_product_catalogue(Actor actor) {
        // actor should be presented with the products catalogue with a list of products
        actor.attemptsTo(
                Ensure.that(Text.of(".title")).isEqualTo("PRODUCTS")
        );

    }
}
