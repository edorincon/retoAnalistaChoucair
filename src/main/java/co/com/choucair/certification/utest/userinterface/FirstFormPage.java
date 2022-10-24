package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FirstFormPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("write the name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("write the month")
            .located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']/select/option[2]"));
    public static final Target SELECT_DAY = Target.the("write the day")
            .located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']/select/option[27]"));
    public static final Target SELECT_YEAR = Target.the("write the year")
            .located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']//*[contains(text(),'1996')]"));
    public static final Target NEXT_LOCATION = Target.the("click en next location")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']/a/span"));
    /*public static final Target INPUT_CITY = Target.the("write the city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("write the postal code").located(By.id("zip"));*/
    public static final Target NEXT_DEVICES = Target.the("click en next devices")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Devices')]"));
}
