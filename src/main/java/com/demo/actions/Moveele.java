package com.demo.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveele {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.findElement(By.xpath("//span[.=✕]")).click();
        driver.findElement(By.xpath("//span[.='Mobiles & Tablets']")).click();
        System.out.println(driver.getCurrentUrl());
        Actions builder = new Actions(driver);
       WebElement ele = driver.findElement(By.xpath("//span[.='Electronics']"));
       builder.moveToElement(ele).build().perform();
       driver.findElement(By.linkText("Apple")).click();
       System.out.println(driver.getCurrentUrl());

    }
}
