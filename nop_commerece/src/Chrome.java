import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
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
        System.out.println("page source "+driver.getPageSource());

        //Navigate to Login page by clicking in on login link
        WebElement loginLink=driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the email field element
        driver.findElement(By.id("Email"));
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("testa23@gmail.com");

        //find the password field element
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");


        //Close the browser
        // driver.close();
        driver.quit();

    }

}
