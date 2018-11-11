package cn.clockworkai.quality.sentry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, QualitySentry");

        WebDriver driver = new ChromeDriver();
        driver.get("https://o2.chinanetcenter.com/app/#/v2/personnel/");
        try {
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.id("username")).sendKeys("XXXXX");
            Thread.sleep(1000);
            driver.findElement(By.id("password1")).sendKeys("XXXXX");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fm1\"]/div[3]/div/input")).click();

            driver.switchTo().defaultContent();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/ul/li[1]/a")).click();

            Thread.sleep(100000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
