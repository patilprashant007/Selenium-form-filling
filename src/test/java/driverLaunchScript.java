import com.sun.xml.internal.fastinfoset.util.StringArray;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverLaunchScript {

    public static void main(String args[]) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\SystemManagementQA\\SystemManagerQA\\Selenium\\src\\test\\resources\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.id("APjFqb")).sendKeys("Rahul", Keys.ENTER);

        WebElement element = driver.findElement(By.xpath("//div[@id='result-stats']"));

        String str = element.getText();
        System.out.println(str); //About 51,70,00,000 results (0.69 seconds)

        String[] aa = str.split(" ");

        System.out.println(aa[1]);

        String s1=aa[1];
        String s2=s1.replaceAll("[^a-z0-9A-z]","");
        System.out.println(s2);
    }
}
