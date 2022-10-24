package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.FirstFormPage;
import co.com.choucair.certification.utest.userinterface.JoinTodayPage;
import co.com.choucair.certification.utest.userinterface.SecondFormPage;
import co.com.choucair.certification.utest.userinterface.ThirdFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinToday implements Task {

    private String strName, strLastName, strEmail, strPassword, strConfirmPassword;

    public JoinToday(String strName, String strLastName, String strEmail, String strPassword, String strConfirmPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static JoinToday the(String strName, String strLastName, String strEmail, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(JoinToday.class, strName, strLastName, strEmail, strPassword, strConfirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JoinTodayPage.JOIN_TODAY_BUTTON),
                Enter.theValue(strName).into(FirstFormPage.INPUT_NAME),
                Enter.theValue(strLastName).into(FirstFormPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(FirstFormPage.INPUT_EMAIL),
                Click.on(FirstFormPage.SELECT_MONTH),
                Click.on(FirstFormPage.SELECT_DAY),
                Click.on(FirstFormPage.SELECT_YEAR),
                Click.on(FirstFormPage.NEXT_LOCATION),
              /*  Enter.theValue(strCity).into(FirstFormPage.INPUT_CITY),
                Enter.theValue(strZip).into(FirstFormPage.INPUT_ZIP),
                Click.on(FirstFormPage.NEXT_DEVICES)*/
                Click.on(FirstFormPage.NEXT_DEVICES),
                Click.on(SecondFormPage.YOUR_COMPUTER),
                Click.on(SecondFormPage.SELECT_YOUR_COMPUTER),
                Click.on(SecondFormPage.VERSION),
                Click.on(SecondFormPage.SELECT_VERSION),
                Click.on(SecondFormPage.LANGUAGE),
                Click.on(SecondFormPage.SELECT_LANGUAGE),
                Click.on(SecondFormPage.YOUR_MOBILE_DEVICE),
                Click.on(SecondFormPage.SELECT_YOUR_MOBILE_DEVICE),
                Click.on(SecondFormPage.MODEL),
                Click.on(SecondFormPage.SELECT_MODEL),
                Click.on(SecondFormPage.OPERATING_SYSTEM),
                Click.on(SecondFormPage.SELECT_OPERATING_SYSTEM),
                Click.on(SecondFormPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(ThirdFormPage.PASSWORD),
                Enter.theValue(strConfirmPassword).into(ThirdFormPage.CONFIRM_PASSWORD),
                Click.on(ThirdFormPage.TERMS_USE),
                Click.on(ThirdFormPage.PRIVACY_SECURITY),
                Click.on(ThirdFormPage.COMPLETE_SETUP)

        );
    }

}
