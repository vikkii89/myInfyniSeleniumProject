package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class FordlogoTesting {

        public WebDriver driver;
        @BeforeClass
        public void setup(){
            System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\Users\\dhana\\Downloads\\chromedriver_win32\\chromedriver.exe");

            // Instantiate a ChromeDriver class.
            driver = new ChromeDriver();

            // launch the browser
            driver.get("https://ford.com");

            // Maximize the browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }


        @Test
        public void ford_logo_validation(){

            // validate Docker logo
            if (driver.findElement(By.xpath("(//span[@class='user-menu-icon fgx-icon icon-account-outline fgx-icon--20'])[2]")).isDisplayed()){
                System.out.println("Ford logo is displayed=====> PASS");
            }

        }

         @Test
         @Parameters({"user","password"})
            public void ford_signin_validation(String user,String password) {
             try {
                 if (driver.findElement(By.xpath("(//span[@class='user-menu-icon fgx-icon icon-account-outline fgx-icon--20'])[2]")).isDisplayed()) {
                     System.out.println("Ford sign in icon is displayed====> PASS");
                     driver.findElement(By.xpath("(//span[@class='user-menu-icon fgx-icon icon-account-outline fgx-icon--20'])[2]")).click();
                     driver.findElement(By.xpath("(//li[@data-fgx-item-template='Sign In'])[2]")).click();
                     Thread.sleep(5000);
                     driver.findElement(By.id("username")).sendKeys(user);
                     driver.findElement(By.id("password")).sendKeys(password);
                     driver.findElement(By.id("submit-btn")).click();
                     Thread.sleep(5000);
                 }
             } catch (Exception e) {
             }
         }


        // (//li[@data-fgx-item-template='Sign In'])[2]
        @AfterClass
         public void tearDown(){
                 driver.quit();
             }

}
