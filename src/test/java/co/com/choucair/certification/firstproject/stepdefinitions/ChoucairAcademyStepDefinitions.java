package co.com.choucair.certification.firstproject.stepdefinitions;

import co.com.choucair.certification.firstproject.model.AcademyChoucairData;
import co.com.choucair.certification.firstproject.questions.Answer;
import co.com.choucair.certification.firstproject.task.Login;
import co.com.choucair.certification.firstproject.task.OpenUp;
import co.com.choucair.certification.firstproject.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {


    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandom wants to learn automation at the academy choucair$")
    public void thanBrandomWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( "Brandom" ).wasAbleTo(
                OpenUp.thePage(), (
                        Login.onThePage(academyChoucairData.get( 0 ).getStrUser(), academyChoucairData.get( 0 ).getStrPassword())
                )
        );
    }


    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo( Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat((Answer.toThe(academyChoucairData.get(0).getStrCourse()))));
    }
}
