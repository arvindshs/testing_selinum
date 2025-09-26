package com.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wast-management-app.vercel.app/");

        File destFolder = new File("./screenshot");
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot/img.png");
        FileHandler.copy(src, dest);
        driver.close();
    }
}
