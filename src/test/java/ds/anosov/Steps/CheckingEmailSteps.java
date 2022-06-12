package ds.anosov.Steps;


import ds.anosov.Page.BasePage;
import ds.anosov.Page.EmailsPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckingEmailSteps extends BasePage {

    EmailsPage emailsPage = new EmailsPage();

    @Step("Отбор по непрочитанным письмам")
    public void setUnreadFilter() {
        emailsPage.setFilter();
        sleep(2000);
    }

    @Step("Отметка непрочитанных писем")
    public void setReadMails() {
        emailsPage.clickOnUnreadMails();
    }

    @Step("Проверка количества непрочитанных писем")
    public void checkUnreadMails() {
        boolean checkUnread = new EmailsPage().getCountEmptyUnread();
        Assertions.assertTrue(checkUnread);
    }








}


