package zoom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dzebna {
    @Test
    public  void search (){

        open("https://zoommer.ge/");
        $("#small-searchterms").setValue("samsung").click();
        SelenideElement search = $("#small-searchterms");
        Assert.assertTrue(search.is(Condition.visible));
    }
     @Test
    public void search2(){
        open("https://zoommer.ge/");
        $("#small-searchterms").setValue("fgh").click();
        SelenideElement search = $("#small-searchterms");
        Assert.assertFalse(search.is(Condition.visible));
    }
}
