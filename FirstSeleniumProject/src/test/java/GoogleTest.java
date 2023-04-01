import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void FirstTestGoogle() throws InterruptedException {

        //  создадим драйвер

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

        WebElement find = driver.findElement(By.name("q"));

        find.sendKeys("selenium");
        find.sendKeys(Keys.RETURN); // нажали искать через enter

//
//        WebElement button = driver.findElement(By.name("btnK"));
//
//        button.click();

        Thread.sleep(2000);

        WebElement text = driver.findElement(By.xpath("//h3[text() = 'Selenium']"));

        Assert.assertEquals(text.getText(), "Selenium");

        driver.quit();

    }

}
