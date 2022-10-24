package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.OpenUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task {

    private OpenUtestPage openPage;

    public static OpenUp startUtest() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openPage));

    }
}
