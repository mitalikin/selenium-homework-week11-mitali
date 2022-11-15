import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {


    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the url
        driver.get(baseUrl);

        //maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get title of the page
        String title = driver.getTitle();
        System.out.println("page title is " + title);

        //get current url
        System.out.println("Current url : " + driver.getCurrentUrl());
        //get page source
        System.out.println("Page source " + driver.getPageSource());

        //Find the username field element
        //driver.findElement(By.name("username"));
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith");

        //driver.findElement(By.id("password"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        //close the driver
        driver.quit();
    }
}
