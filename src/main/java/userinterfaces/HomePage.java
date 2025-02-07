package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_SIGNIN = Target.the("Button login")
            .locatedBy("//a[@href='#/login']");

    public static final Target BTN_NEW_ARTICLE = Target.the("Button new article")
            .locatedBy("//*[@href='#/editor']");

    public static final Target BTN_HOME = Target.the("Clic on the button Home")
            .locatedBy("//*[text()='Home']");

    public static final Target BTN_GLOBAL_FEED = Target.the("Click on the button global feed")
            .locatedBy("//button[@class='nav-link ']");
}
