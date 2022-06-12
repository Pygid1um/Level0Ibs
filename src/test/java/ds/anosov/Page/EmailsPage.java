package ds.anosov.Page;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;

public class EmailsPage {

    SelenideElement filterUnreadInput = $x("//div[@class='select']");
    SelenideElement choiceUnreadInput = $x("//span[text()='Непрочитанные']");
    ElementsCollection elementsCollectionInput = $$x("//div[@class='llc__read-status llc__read-status_small']");
    private int count;

    public void setFilter() {
        filterUnreadInput.click();
        choiceUnreadInput.click();
    }

    public void clickOnUnreadMails() {
        ElementsCollection elementsCollection = elementsCollectionInput;
        int count = elementsCollection.size();
        for (int i = 0; i < count; i++) {
            elementsCollection.get(i).click();
        }
    }

    public boolean getCountEmptyUnread () {
        if (count == 0) {
            return true;
        } else return false;
    }

}
