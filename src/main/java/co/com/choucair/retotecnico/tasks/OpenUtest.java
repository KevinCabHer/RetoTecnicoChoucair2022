package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtest implements Task {

    private UtestPage utestPage;
    public static OpenUtest thePage() {
        return Tasks.instrumented(OpenUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
