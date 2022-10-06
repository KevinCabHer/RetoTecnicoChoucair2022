package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class devices extends PageObject {

    public static final Target SO = Target.the("select list so")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target SOSELECT = Target.the("select so")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("select list version")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");

    public static final Target VERSIONSELECT = Target.the("select version")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[16]");

    public static final Target LANGUAGE = Target.the("select list languaje")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");

    public static final Target LANGUAGESELECT = Target.the("select language")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");

    public static final Target BUTTONNEXT = Target.the("button next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
