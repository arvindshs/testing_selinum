package com.demo.sample;


import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleopen {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://arvindhsonline.vercel.app");
        driver.findElement(By.name("user_name")).sendKeys("arvind");
        driver.findElement(By.name("user_email")).sendKeys("sample@email.com");
        driver.findElement(By.name("message")).sendKeys("Hi this the sample mail for the testing in the selinum by the java code");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        
    }
}
