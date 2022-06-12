package ds.anosov.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    SelenideElement mainEnterButtonInput = $x("//button[@data-testid='enter-mail-primary']");
    SelenideElement loginInput = $x("//input[@name='username']");
    SelenideElement passwordEnterButtonInput = $x("//button[@data-test-id='next-button']");
    SelenideElement passwordInput = $x("//input[@name='password']");
    SelenideElement registrationEnterButtonInput = $x("//button[@data-test-id='submit-button']");
    SelenideElement checkRegistrationLoginInput = $x("//span[@class='ph-project__user-name svelte-1hiqrvn']");

    public void openPage() {
        open("https://mail.ru/");
    }

    public void clickEnterButton() {
        mainEnterButtonInput.click();
    }


    public void inputRegistrationData(String LOGIN, String PASSWORD) {
        loginInput.setValue(LOGIN);
        passwordEnterButtonInput.click();
        passwordInput.setValue(PASSWORD);
        registrationEnterButtonInput.click();
        checkRegistrationLoginInput.shouldHave(text(LOGIN));
    }
}
