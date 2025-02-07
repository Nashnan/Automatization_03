package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_EMAIL = Target.the("Enter the email")
            .locatedBy("//input[@placeholder='Email']");

    public static final Target TXT_PASSWORD = Target.the("Enter the password")
            .locatedBy("//input[@placeholder='Password']");
    public static final Target BTN_LOGIN = Target.the("Click en button login")
            .locatedBy("//button[text()='Login']");

}
