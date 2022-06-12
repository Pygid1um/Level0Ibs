package ds.anosov.Steps;

import ds.anosov.Page.BasePage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class FeatureSteps extends BasePage {

    RegistrationMailSteps registrationMailSteps = new RegistrationMailSteps();
    CheckingEmailSteps checkingEmailSteps = new CheckingEmailSteps();
    BasePage BasePage = new BasePage();



    @Когда("Открывается главная страница почты")
    public void openMainMailsPage() {
        registrationMailSteps.openMainPage();
    }

    @И("Нажимает на кнопку входа")
    public void clickMainButton() {
        registrationMailSteps.enterToMail();
    }

    @И("Вводит логин и пароль")
    public void inputLoginPassword() {
        registrationMailSteps.inputLoginAndPassword();
    }

    @И("Ставит фильтр непрочитанных писем")
    public void setFilterUnreadMails() {
        checkingEmailSteps.setUnreadFilter();
    }

    @И("Отмечает каждое непрочитанное письмо")
    public void readMails() throws InterruptedException  {
        checkingEmailSteps.setReadMails();
    }

    @Тогда("Непрочитанные письма отсутствуют")
    public void checkUnreadMails() {
        checkingEmailSteps.checkUnreadMails();
    }

}
