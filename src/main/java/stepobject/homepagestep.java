package stepobject;

import com.codeborne.selenide.Condition;
import pageobject.homepage;

import java.time.Duration;

public class homepagestep extends homepage {

    public homepagestep searchvalue (String text) {

        searchbox.setValue("მობილური").pressEnter();
        return this;
    }



    public homepagestep gobasketbtn () {
        basketbtn.hover();
        gotobasket.click();

        return this;
    }
}
