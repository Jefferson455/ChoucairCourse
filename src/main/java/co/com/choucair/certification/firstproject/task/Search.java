package co.com.choucair.certification.firstproject.task;

import co.com.choucair.certification.firstproject.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String strCourse;

    public Search(String strCourse){
        this.strCourse = strCourse;
    }
    public static Search the(String course) { return Tasks.instrumented(Search.class, course); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on( SearchCoursePage.BUTTON_UC),
                Enter.theValue(strCourse).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)
        );

    }
}
