import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class GooglePratice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SystemManagementQA\\SystemManagerQA\\Selenium\\src\\test\\resources\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.id("APjFqb")).sendKeys("Rahul");
        Thread.sleep(3000);
        List<WebElement> elements=driver.findElements(By.xpath("//li[@class='sbct PZPZlf sbre']/div/div[2]/div/div/span"));
        for (WebElement ele:elements){
            System.out.println(ele.getText());
            if (ele.getText().contains("Rahul Dravid"))
            {

              ele.click();
                //ele.findElement(By.xpath("//div[@role='presentation']/span")).click();
            }

        }
//https://formfilling.co.in





    }
}
