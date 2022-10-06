package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class personal extends PageObject {
    public static final Target FIRST_NAME = Target.the("first name field")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("last name field")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email field")
            .located(By.id("email"));

    public static final Target MONTH =Target.the("month field")
            .located(By.id("birthMonth"));
    public static final Target DAY =Target.the("day field")
            .located(By.id("birthDay"));
    public static final Target YEAR =Target.the("year field")
            .located(By.id("birthYear"));

    public static final Target BUTTONNEXT = Target.the("button next location")
            .locatedBy("//a[@class=\"btn btn-blue\"]");
}
