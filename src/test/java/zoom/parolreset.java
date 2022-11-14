package zoom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class parolreset {
    @Test

    public void parolreset() {
        open("https://zoommer.ge/");
        $(byText("პროფილი")).click();
        $(byText("დაგავიწყდათ პაროლი?")).click();
        $("#Value").setValue("nata561@yahoo.com");
        $(byText("აღდგენა")).click();
        sleep(5000);
        SelenideElement name = $(By.xpath("/html/body/div[11]/div[2]/div[3]/button"));
        Assert.assertTrue(name.is(Condition.visible));
    }

@Test
    public void parolreset2(){
    open("https://zoommer.ge/");
    $(byText("პროფილი")).click();
    $(byText("დაგავიწყდათ პაროლი?")).click();
    $("#Value").setValue("nata561@yahoo.com");
    $(byText("აღდგენა")).click();
    sleep(5000);
    SelenideElement name = $(By.xpath("/html/body/div[11]/div[2]/div[3]/button"));
    Assert.assertFalse(name.is(Condition.visible));


}
}

