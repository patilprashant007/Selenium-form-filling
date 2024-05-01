package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {

        implicitWait();
       // explicitWait();
    }

//    private static void explicitWait() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com/ncr");
//
//
//        driver.findElement(By.name("q")).sendKeys("scrolltest" + Keys.ENTER);
//    }

    private static void implicitWait() {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://reqres.in/api/users?delay=9");
        System.out.println(driver.getPageSource());
    }

}

