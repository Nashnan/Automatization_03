package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NewArticlePage {
    public static final Target TXT_TITLE = Target.the("Enter title of the article")
            .locatedBy("//input[@name='title']");

    public static final Target TXT_DESCRIPTION = Target.the("Enter description of the article")
            .locatedBy("//input[@name='description']");

    public static final Target TXT_TEXTO = Target.the("Enter text of the article")
            .locatedBy("//textarea[@name='body']");

    public static final Target TXT_TAGS = Target.the("Enter tags of the article")
            .locatedBy("//input[@name='tags']");

    public static final Target BTN_PUBLISH = Target.the("Clic on button publish article")
            .locatedBy("//button[@class='btn btn-lg pull-xs-right btn-primary']");

}
