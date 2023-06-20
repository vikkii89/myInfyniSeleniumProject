package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DockerTesting {

    public WebDriver driver;
    @BeforeClass
    public void setup(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\dhana\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
         driver = new ChromeDriver();

        // launch the browser
        driver.get("https://docker.com");

        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void docker_logo_validation(){

            // validate Docker logo
            if (driver.findElement(By.xpath("//li[@class='logo']")).isDisplayed()){
                System.out.println("Docker logo is displayed=====> PASS");
            }

        }


    @Test
    public void navigateToDockerProPage(){
        // do mouse Hover on products Header menu link

        try{
            WebElement products = driver.findElement(By.xpath("(//a[text()='Products'])[1]"));

            // creating object of an action class
            Actions act = new Actions(driver);
            act.moveToElement(products).perform();

            // wait for 3 seconds
            Thread.sleep(3000);

            // clicking on docker pro link
            driver.findElement(By.xpath("(//a[text()='Docker Pro'])[1]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // validate docker Pro header

            if (driver.findElement(By.xpath("(//h1[text()='Docker Pro'])[1]")).isDisplayed()){
                System.out.println("User successfully navigated to Docker Pro Page");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }


    @AfterClass
    public void tearDown(){
        driver.quit();


    }



}
