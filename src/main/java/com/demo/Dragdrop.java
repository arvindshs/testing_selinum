package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
    public static void drapdropfunc(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(src, dest).build().perform();
        System.out.println("Drag and drop is done");
        driver.close();
    }
    static void dragdropBy(){
        WebDriver drivers = new ChromeDriver();
        drivers.get("https://jqueryui.com/draggable/");
        drivers.manage().window().maximize();
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drivers.switchTo().frame(0);

        WebElement srcs = drivers.findElement(By.id("draggable"));
        int x = srcs.getLocation().getX();
        int y = srcs.getLocation().getY();
        Actions builders = new Actions(drivers);
        builders.dragAndDropBy(srcs, x+50, y+100).build().perform();
        System.out.println("this is done");
    }
    public static void main(String[] args) {
        // drapdropfunc();
        dragdropBy();
    }
}
