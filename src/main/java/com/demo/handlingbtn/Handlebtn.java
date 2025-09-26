package com.demo.handlingbtn;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebtn {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wast-management-app.vercel.app/");
        WebElement ele = driver.findElement(By.xpath("//a[text()='Buy Material']"));
        Point p = ele.getLocation();
        System.out.println("x = "+ p.getX() + "y = " + p.getY());

        String bgColor = ele.getCssValue("background-color");
        System.out.println("Background color: " + bgColor);

        Rectangle size = driver.findElement(By.xpath("//button[text()='Submit']")).getRect();
        Dimension dim = size.getDimension();
        System.out.println(dim.getWidth()+" "+ dim.getHeight());
        driver.close();
    }
}
