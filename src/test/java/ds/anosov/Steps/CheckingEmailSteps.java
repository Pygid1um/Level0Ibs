package ds.anosov.Steps;

import ds.anosov.Page.EmailsPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class CheckingEmailSteps  {

    EmailsPage emailsPage = new EmailsPage();

    @Step("Отбор по непрочитанным письмам")
    public void setUnreadFilter() {
        emailsPage.setFilter();
    }

    @Step("Отметка непрочитанных писем")
    public void setReadMails() throws InterruptedException  {
        emailsPage.clickOnUnreadMails();
    }

    @Step("Проверка количества непрочитанных писем")
    public void checkUnreadMails() {
        boolean checkUnread = new EmailsPage().getCountEmptyUnread();
        Assertions.assertTrue(checkUnread);
    }








}


