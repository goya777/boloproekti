package pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static dataobject.homepagedata.*;

public class homepage {
   public SelenideElement
                      searchbox = $("#small-searchterms"),
                      basketbtn = $(".h_basket_icon",0 ),
                      gotobasket = $(new ByText("კალათაში გადასვლა")),
                      emptybaskettext = $(new ByText(computer));

   }

