package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.Information;
import co.com.choucair.certification.utest.questions.VerifyRegister;
import co.com.choucair.certification.utest.tasks.JoinToday;
import co.com.choucair.certification.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than I want to learn testing at the platform Utest")
    public void thanIWantToLearnTestingAtThePlatformUtest() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.startUtest());

    }

    @When("^I enter my personal information in the registration form")
    public void iEnterMyPersonalInformationInTheRegistrationForm(List<Information> date) {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.the(
                date.get(0).getStrName(),
                date.get(0).getStrLastName(),
                date.get(0).getStrEmail(),
                date.get(0).getStrPassword(),
                date.get(0).getStrConfirmPassword()
        ));
    }

    @Then("^I expect to receive a message confirming the creation of my account")
    public void iExpectToReceiveAMessageConfirmingTheCreationOfMyAccount(List<Information> date) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRegister.toThe(date.get(0).getStrVerify())));
    }

}
