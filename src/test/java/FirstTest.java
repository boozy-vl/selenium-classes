import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.List;

public class FirstTest {

    @Test
    //Generate new Test method
    public void firstTest() throws Exception {
        //I would like to start Chrome browser
        //DesiredCapabilities - class
        //desiredCapabilities - value
        DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
        //RemoteWebDriver - parametr
        RemoteWebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:6000/wd/hub"),
                desiredCapabilities
        );
        //Open link in Chrome
        driver.get("http://google.com");
        //Find web element "search bar" on google.com with ID on lst-ib
        WebElement element = driver.findElement(By.cssSelector("#lst-ib"));
        //Type something to finded element
        element.sendKeys("JOPA");
        //Send Enter after Jopa
        element.sendKeys(Keys.RETURN);
        //Wait 2sec to load content on site
        Thread.sleep(2000);
        //Find element on loaded site: array with sites links
        List<WebElement> elementList = driver.findElements(By.cssSelector("div.g cite"));
        //
        Assert.assertEquals(
                "The link forwards to wrong domain",
                "https://www.jopa.ee/",
                elementList.get(0).getText()
        );
        System.out.printf(elementList.get(0).getText());
        //Wait 15000 millis before close
        //Thread.sleep(15000);
        //Close Chrome
        driver.quit();
    }
}
