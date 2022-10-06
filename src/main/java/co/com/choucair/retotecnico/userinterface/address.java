package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class address extends PageObject {
    public static final Target CITY = Target.the("text field city")
            .located(By.id("city"));
    public static final Target POSTALCODE = Target.the("text field postal code")
            .located(By.id("zip"));
    public static final Target BUTTONNEXT= Target.the("button next device")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

    public static final Target BUTTONCOUNTRY = Target.the("button country")
            .locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");
    public static final Target COUNTRY = Target.the("text field country")
            .locatedBy("//input[@class=\"form-control ui-select-search ng-valid ng-dirty ng-touched ng-empty\"]");

}
