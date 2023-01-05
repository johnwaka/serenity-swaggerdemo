package swaglab.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import swaglab.model.swaglabuser;

public class LoginWithInvalidCreds {

    public static Performable asA(swaglabuser lockeduser) {
        return Task.where("{0} logs in as a:" + lockeduser,
                Enter.theValue(lockeduser.username).into("#user-name"),
                Enter.theValue(lockeduser.password).into("#password"),
                Click.on(Button.withNameOrId("login-button"))
        );
    }
}
