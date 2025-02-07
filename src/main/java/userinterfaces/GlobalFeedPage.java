package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GlobalFeedPage {
    public static final Target TXT_COMPARE_ARTICLE_TITLE = Target.the("Validate the title of the new article")
            .locatedBy("//*[text()='Samsung']");

}
