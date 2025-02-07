package tasks;

import models.NewArticleData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomePage;
import userinterfaces.NewArticlePage;

public class AddProductTask implements Task {

    NewArticleData newArticleData;

    public AddProductTask(NewArticleData newArticleData) {
        this.newArticleData = newArticleData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_NEW_ARTICLE));
        actor.wasAbleTo(Enter.theValue(newArticleData.getTitle()).into(NewArticlePage.TXT_TITLE),
                Enter.theValue(newArticleData.getDescriptions()).into(NewArticlePage.TXT_DESCRIPTION),
                Enter.theValue(newArticleData.getDescriptions()).into(NewArticlePage.TXT_TEXTO),
                Enter.theValue(newArticleData.getTags()).into(NewArticlePage.TXT_TAGS),
                Click.on(NewArticlePage.BTN_PUBLISH));
        actor.attemptsTo(Click.on(HomePage.BTN_HOME),
                Click.on(HomePage.BTN_GLOBAL_FEED));
    }

    public static AddProductTask newArticle(NewArticleData newArticleData) {
        return Tasks.instrumented(AddProductTask.class, newArticleData);
    }

}
