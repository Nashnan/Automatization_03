package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomePage;
import userinterfaces.LoginPage;

public class LoginTask implements Task {
    LoginData data;

    public LoginTask(LoginData data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_SIGNIN));
        actor.attemptsTo(Enter.theValue(data.getEmail()).into(LoginPage.TXT_EMAIL),
                Enter.theValue(data.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));
    }

    public static LoginTask login(LoginData data){
        return Tasks.instrumented(LoginTask.class, data);
    }

}
