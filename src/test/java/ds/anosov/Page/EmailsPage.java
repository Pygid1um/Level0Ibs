package ds.anosov.Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;

public class EmailsPage {

    SelenideElement filterUnreadInput = $x("//div[@class='select']");
    SelenideElement choiceUnreadInput = $x("//span[text()='Непрочитанные']");
    ElementsCollection elementsCollectionInput = $$x("//span[@title='Пометить прочитанным']");
    int countOfUnreadMails;

    public void setFilter() {
        filterUnreadInput.click();
        choiceUnreadInput.click();
    }

    /**
     * Поскольку коллекция элементов лениво оценивается, каждый из элементов в коллекции хранит только индекс элемента
     * и коллекцию XPath.
     * Когда атрибут одного из элементов коллекции обновляется (после клика на непрочитанном письме), он влияет на
     * последующую итерацию цикла, вызывая сокращение размера динамической коллекции, поэтому нужно в цикле указывать 0 индекс
     */

    public void clickOnUnreadMails() throws InterruptedException  {
        ElementsCollection elementsCollection = elementsCollectionInput;
        countOfUnreadMails = elementsCollection.size();
        for (int i = 0; i < countOfUnreadMails; i++) {
            elementsCollection.get(0).click();

        }
    }

    public boolean getCountEmptyUnread () {
        if (countOfUnreadMails == 0) {
            return true;
        } else return false;
    }

}
