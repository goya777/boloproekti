package proekti;

import chromerunner.chrome;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepobject.homepagestep;

import static dataobject.homepagedata.*;


public class homepagetest extends chrome {
    @Test
    public void zommerhome(){
        homepagestep home = new homepagestep();
        home.searchvalue(mobiledata);

        Assert.assertTrue(Boolean.parseBoolean("empty basket"));

    }
}


