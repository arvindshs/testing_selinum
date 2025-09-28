package com.demo.select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handleselect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement fruit = driver.findElement(By.id("fruits"));
        Select fruits = new Select(fruit);
        fruits.selectByVisibleText("Mango");
        WebElement country = driver.findElement(By.id("country"));
        Select countrys = new Select(country);
        countrys.selectByValue("India");
        WebElement name = countrys.getFirstSelectedOption();
        System.out.println(name.getText());
        WebElement supe = driver.findElement(By.id("superheros"));
        Select supes = new Select(supe);
        System.out.println(supes.isMultiple());
        supes.selectByIndex(0);
        supes.selectByIndex(1);
        supes.selectByIndex(2);

        List<WebElement> appsupes = supes.getAllSelectedOptions();
        for (WebElement i : appsupes) {
            System.out.println(i.getText());
        }
        WebElement lang = driver.findElement(By.id("lang"));
        Select langs = new Select(lang);
        List<WebElement> plang = langs.getOptions();
        
        for (WebElement webElement : plang) {
            System.out.println(webElement.getText());
        }

        driver.close();

    }
}
