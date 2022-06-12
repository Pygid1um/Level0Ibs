package ds.anosov.Steps;

import ds.anosov.Page.BasePage;
import ds.anosov.Page.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationMailSteps extends BasePage {

    RegistrationPage registrationPage = new RegistrationPage();

    private final static String LOGIN = "tlevel0@mail.ru";
    private final static String PASSWORD = "APoOjYayo31";

    @Step("Открытие главной страницы Mail.ru")
    public void openMainPage() {
        registrationPage.openPage();
    }

    @Step("Вход в почту")
    public void enterToMail() {
        registrationPage.clickEnterButton();
    }

    @Step("Ввод логина и пароля")
    public void inputLoginAndPassword() {
        registrationPage.inputRegistrationData(LOGIN, PASSWORD);
    }

}
