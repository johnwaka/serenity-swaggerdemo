package swaglab.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import swaglab.model.swaglabuser;

public class LoginWithValidCreds {
    public static Performable asA(swaglabuser standarduser) {
        return Task.where("{0} logs in as a:" + standarduser,
                Enter.theValue(standarduser.username).into("#user-name"),
                Enter.theValue(standarduser.password).into("#password"),
                Click.on(Button.withNameOrId("login-button"))
        );
    }
}
