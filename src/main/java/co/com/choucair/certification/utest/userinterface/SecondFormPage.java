package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SecondFormPage extends PageObject {

    public static final Target YOUR_COMPUTER = Target.the("select the SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_YOUR_COMPUTER = Target.the("select the option SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[4]/span/div"));
    public static final Target VERSION = Target.the("select the version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_VERSION = Target.the("select the version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[32]/span/div"));
    public static final Target LANGUAGE = Target.the("select the language")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_LANGUAGE = Target.the("select the option of language")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[13]/span/div"));
    public static final Target YOUR_MOBILE_DEVICE = Target.the("select the mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_YOUR_MOBILE_DEVICE = Target.the("select the option mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span/div"));
    public static final Target MODEL = Target.the("select the mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_MODEL = Target.the("select the option mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[94]/span/div"));
    public static final Target OPERATING_SYSTEM = Target.the("select the operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("select the option operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target NEXT_LAST_STEP = Target.the("click en the next last step")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Last Step')]"));



}

