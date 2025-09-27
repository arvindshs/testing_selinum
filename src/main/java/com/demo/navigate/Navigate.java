package com.demo.navigate;

import java.time.Duration;
// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wast-management-app.vercel.app/buy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[.//p[contains(normalize-space(text()), 'RECYCLE RALLY')]]")).click();
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://wast-management-app.vercel.app");
        driver.navigate().refresh();
        driver.close();
    }
}
