package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;




public class Google_TC001 {
    @Test
    public void validateGooglePage(){

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\dhana\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // launch the browser
        driver.get("https://google.com");

        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // validate google logo
        if (driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed()){
            System.out.println("Google logo is displayed=====> PASS");
        }

        driver.quit();
        }


    }

