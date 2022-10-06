package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Complete extends PageObject {

    public static final Target PASSWORD = Target.the("text field password")
            .located(By.id("password"));

    public static final Target CONFIRMPASSWORD = Target.the("test field confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKONE = Target.the("check number one")
            .locatedBy("//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"]");

    public static final Target CHECKTWO = Target.the("check number two")
            .locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BUTTONCOMPLETE = Target.the("button finality")
            .locatedBy("//a[@class=\"btn btn-blue\"]");
}
