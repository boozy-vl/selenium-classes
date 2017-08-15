import com.mtrading.selenium.DashboardPage;
import com.mtrading.selenium.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTest extends AbstractTestCase{



//    @Test
//   public void linkTest() throws Exception {
//
//        this.getDriver().get("https://mtrading.com/");
//
//        this.getDriver().findElement(By.linkText("Login")).click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(this.getDriver(), 30, 300);
//        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
//
//        this.webDriver.switchTo().window(this.webDriver.getWindowHandles().toArray()[1].toString());
//        webDriverWait.until(ExpectedConditions.urlToBe("https://accounts.mtrading.com/cas/login?language=en-US"));
//
//
//        //Poshli vse na hui
//        //this.webDriver.quit();
//    }

    @Test
    public void secondTest() throws Exception {

//        this.getDriver().get("http://accounts.mtrading.com/cas/login");
        LoginPage loginPage = new LoginPage(this.getDriver());
        loginPage.open();
        loginPage.login("i1888146@mvrht.com","i1888146@mvrht.com");
//        loginPage.emailInputWebElement.sendKeys("i1888146@mvrht.com");
//        loginPage.passwordInputWebElement.sendKeys("i1888146@mvrht.com");
//        loginPage.loginButtonWebElement.click();
//        this.getDriver().findElement(By.cssSelector("#username")).sendKeys("i1888146@mvrht.com");
//        this.getDriver().findElement(By.cssSelector("#password")).sendKeys("i1888146@mvrht.com");
//        this.getDriver().findElement(By.cssSelector("[name='submitButton']")).click();

        WebDriverWait webDriverWait = new WebDriverWait(this.getDriver(), 30, 300);
        webDriverWait.until(ExpectedConditions.urlToBe(new DashboardPage(this.getDriver()).getUrl()));
    }
}

