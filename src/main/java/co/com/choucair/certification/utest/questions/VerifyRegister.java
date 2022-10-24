package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.ThirdFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyRegister implements Question<Boolean> {

    private String verify;

    public VerifyRegister(String verify) {
        this.verify = verify;
    }

    public static VerifyRegister toThe(String verify) {

        return new VerifyRegister(verify);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String messageVerify = Text.of(ThirdFormPage.MESSAGE_VERIFY).viewedBy(actor).asString();
        return verify.equals(messageVerify);
    }
}
