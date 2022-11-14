package zoom;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class registracia {
@Test
public void registraction1() {

    open("https://zoommer.ge/");
    $(byText("პროფილი")).click();
    $(byText("რეგისტრაცია")).click();
    $(By.id("Email")).setValue("goia.nata777@gmail.com").click();
    $(By.id("register-password")).setValue("Testi123%").pressEnter();
    $(By.id("ConfirmPassword")).setValue("Testi123%").pressEnter();
    $(By.className("registration_checkmark")).click();
    Assert.assertTrue($("#register-button").is(Condition.enabled));

    sleep(5000);

 }

 @Test
    public void registraction2(){

     open("https://zoommer.ge/");
     $(byText("პროფილი")).click();
     $(byText("რეგისტრაცია")).click();
     $(By.id("Email")).setValue("goia.nata777@gmail.com").click();
     $(By.id("register-password")).setValue("Testi123%").pressEnter();
     $(By.id("ConfirmPassword")).setValue("Testi123%").pressEnter();
     $(By.className("registration_checkmark")).click();
     Assert.assertFalse($("#register-button").is(Condition.enabled));
     sleep(5000);
 }
}
