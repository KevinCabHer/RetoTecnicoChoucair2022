package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class RegisterUserUtest implements Task {


    public static RegisterUserUtest register() {
        return Tasks.instrumented(RegisterUserUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(Home.JOIN),

                SendKeys.of("Kevin").into(personal.FIRST_NAME),
                SendKeys.of("Caballero").into(personal.LAST_NAME),
                SendKeys.of("prueba_choucair2@gmail.com").into(personal.EMAIL),
                SendKeys.of("October").into(personal.MONTH),
                SendKeys.of("10").into(personal.DAY),
                SendKeys.of("10").into(personal.YEAR),
                Click.on(personal.BUTTONNEXT),

                SendKeys.of("Bogotá").into(address.CITY),
                Hit.the(Keys.ARROW_DOWN).into(address.CITY),
                Hit.the(Keys.ENTER).into(address.CITY),
                SendKeys.of("12345").into(address.POSTALCODE),
                //Click.on(address.BUTTONCOUNTRY),
                //SendKeys.of("Colombia").into(address.COUNTRY),
                //Hit.the(Keys.ENTER).into(address.COUNTRY),
                Click.on(address.BUTTONNEXT),

                Click.on(devices.SO),
                Click.on(devices.SOSELECT),
                Click.on(devices.VERSION),
                Click.on(devices.VERSIONSELECT),
                Click.on(devices.LANGUAGE),
                Click.on(devices.LANGUAGESELECT),
                Click.on(devices.BUTTONNEXT),

                SendKeys.of("Contraseña123456789").into(Complete.PASSWORD),
                SendKeys.of("Contraseña123456789").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)
        );

    }
}
