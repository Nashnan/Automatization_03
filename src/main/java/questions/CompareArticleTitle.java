package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.GlobalFeedPage;

public class CompareArticleTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String validate = Text.of(GlobalFeedPage.TXT_COMPARE_ARTICLE_TITLE).viewedBy(actor).asString();
        return validate;
    }

    public static CompareArticleTitle is(){
        return new CompareArticleTitle();
    }
}
