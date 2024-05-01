import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static jdk.nashorn.internal.objects.NativeObject.keys;

public class FromFillingEx {
    public static void main(String[] args) throws InterruptedException {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\SystemManagementQA\\SystemManagerQA\\Selenium\\src\\test\\resources\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://formfilling.co.in");


        driver.findElement(By.className("(/html/body/div//*[@class='menu-link nav-link btn btn-md btn-auto btn-grad'][1])[1]")).click();


         driver.findElement(By.className("//input[@name='email']")).sendKeys(" pp@123gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Plk123");
         driver.findElement(By.id("password2")).sendKeys("Plk123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");////

         driver.findElement(By.id("name")).sendKeys("Prashant");
         driver.findElement(By.id("mobile")).sendKeys("9484738839");
         driver.findElement(By.id("DateofBirth")).sendKeys("19/11/2000");

        driver.findElement(By.id("first_categoriescity")).click();
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("first_categoriescity")).sendKeys("Maharashtra");


        driver.findElement(By.id("second_categoriescity")).click();
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("second_categoriescity")).sendKeys("solapur");

        driver.findElement(By.id("Address")).sendKeys("Pune Wakad");

        driver.findElement(By.id("pincode")).sendKeys("411057");

        //driver.findElement(By.id("security_code")).sendKeys("tmzmp");

        driver.findElement(By.id("terms")).click();

          driver.findElement(By.id("Submit")).click();
          driver.navigate().back();

          driver.findElement(By.xpath("header-navbar-overlay")).click();
    }
}



