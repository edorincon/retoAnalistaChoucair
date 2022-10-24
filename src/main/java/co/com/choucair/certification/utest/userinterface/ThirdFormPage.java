package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ThirdFormPage extends PageObject {

    public static final Target PASSWORD = Target.the("write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_USE = Target.the("click in the uTest Terms of Use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_SECURITY = Target.the("click in the privacy and security")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("click in the privacy and security")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));
    public static final Target MESSAGE_VERIFY = Target.the("verify the registration")
            .located(By.xpath("//div[@class='image-box-header']/h1"));

}
