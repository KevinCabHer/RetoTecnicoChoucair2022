package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home extends PageObject {
    public static final Target JOIN = Target.the("Button init register")
            .locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
