package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get current URL
        System.out.println("Current url: "+driver.getCurrentUrl());
        //get page Source
        System.out.println("Pgge source "+driver.getPageSource());

        //Find the email field element
        //driver.findElement(By.name("username"));
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //find the password field element
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


        //Close the browser
        // driver.close();
       driver.quit();

    }
}
