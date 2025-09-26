package com.demo.sample;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googleopen {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://arvindhsonline.vercel.app");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("arvind");
        driver.findElement(By.name("user_email")).sendKeys("sample@email.com");
        driver.findElement(By.name("message")).sendKeys("Hi this the sample mail for the testing in the selinum by the java code");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();

        driver.close();
    }
}
