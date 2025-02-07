package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.MessageExceptions;
import models.LoginData;
import models.NewArticleData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.apache.commons.math3.analysis.function.Constant;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.CompareArticleTitle;
import tasks.AddProductTask;
import tasks.LoginTask;
import utils.Constants;

import java.util.List;

public class AddProductStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://conduit-realworld-example-app.fly.dev/#/"));
    }

    @Given("^The user logs in$")
    public void theUserLogsIn(List<LoginData> loginDataList) {
        LoginData dataLogin;
        dataLogin = loginDataList.get(0);

        OnStage.theActorInTheSpotlight().wasAbleTo(LoginTask.login(dataLogin));
    }

    @When("^The user add a new product to list$")
    public void theUserAddANewProductToList(List<NewArticleData> newArticleData) {
        NewArticleData dataNewArticle;
        dataNewArticle = newArticleData.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(AddProductTask.newArticle(dataNewArticle));
    }

    @Then("^The user could see a product added in the list$")
    public void theUserCouldSeeAProductAddedInTheList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareArticleTitle.is()
                , Matchers.is(Matchers.equalTo(Constants.VALIDATION_TITLE)))
                .orComplainWith(MessageExceptions.class,Constants.VALIDATION_FAILURE));
    }
}
