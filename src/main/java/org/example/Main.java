package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/USER/Downloads/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver;
        driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com");

        driver.findElement(By.id("login-username")).sendKeys("patilp1278@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Pass@0909");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(20000);
    }


        // Correct the system property name
//        System.setProperty("webdriver.chrome.driver", "/Users/USER/Downloads/chromedriver-win64/chromedriver.exe");
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver;
//        driver = new ChromeDriver(options);
//
//        driver.get("https://app.vwo.com");
//
//        driver.findElement(By.id("login-username")).sendKeys("patilp1278@gmail.com");
//        driver.findElement(By.id("login-password")).sendKeys("Pass@0909");
//        driver.findElement(By.id("js-login-btn")).click();
//        // Thread.sleep is preferred over driver.wait in Java
//        Thread.sleep(20000);
//    }
    }
