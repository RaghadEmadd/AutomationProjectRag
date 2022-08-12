package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver=null;

    @Before
    public  static void OpenBrowser(){
        //1)Set System property
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Raghad.Emad\\IdeaProjects\\AutomationScript\\drivers\\chromedriver.exe");

        //2) create new object from webdriver
        driver = new ChromeDriver();

        //3)configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4)navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
