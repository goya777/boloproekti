package zoom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class addbasket {
    @Test
    public void basketi(){
        open("https://zoommer.ge/");
        $("#small-searchterms").setValue("Samsung Galaxy S21 FE 5G 8/128GB White").pressEnter();
        $(byClassName("product_basket_compare")).doubleClick();
        $(By.xpath("/html/body/div[7]/header/div[4]/div[2]/div[3]/div[1]/div[1]/svg/path")).isDisplayed();
        Assert.assertFalse($(By.xpath("/html/body/div[7]/header/div[4]/div[2]/div[3]/div[1]/div[1]/svg/path")).is(Condition.visible));

    }
}
