package chromerunner;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class chrome {
    @BeforeTest

    public static void zoom (){

        open("https://zoommer.ge//");
    }
}