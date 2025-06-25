package com.example.ontap_buoi3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriveTest {
    private WebDriver webDriver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void dangNhap() throws InterruptedException {
        //truy cap trang
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        //click vao menu
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        Thread.sleep(2000);

        //click vao dang nhap
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        //nhap user pass
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        //click login
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
        Assertions.assertEquals("Formal Shoes",webElement.getText());

        //thoat
        webDriver.quit();
    }
}
