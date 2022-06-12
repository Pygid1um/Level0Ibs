package ds.anosov.Page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;


public class BasePage {

@BeforeAll
    public static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true; // удалить
        SelenideLogger.addListener("allure", new AllureSelenide());



    }
}
