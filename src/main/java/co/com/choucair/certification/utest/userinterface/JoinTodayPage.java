package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JoinTodayPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Button the registration").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

}
