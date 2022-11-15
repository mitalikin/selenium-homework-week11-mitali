import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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
        WebElement username = driver.findElement(By.name("user[email]"));
        username.sendKeys("mital@gmail.com");

        //driver.findElement(By.id("password"));
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc123");
        //close driver
        driver.quit();
    }


}
