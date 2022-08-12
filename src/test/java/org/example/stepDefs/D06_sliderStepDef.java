package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_slider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_sliderStepDef {
    P06_slider slider =new P06_slider();
    @Given("users clicks on home screen logo")
    public void clickHomeLogo(){
        slider.homePageLogo.click();
    }
    @Then("user clicks on Nokia slider")
    public void clickFirstSlider() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[aria-label=\"nivo-imageLink\"]")).click();
        Thread.sleep(1000);

        Hooks.driver.findElement(By.cssSelector("button[class=\"cls\"][aria-label=\"Close\"]")).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;

        js.executeScript("arguments[0].click();", Hooks.driver.findElements(By.cssSelector("div[id=\"sl-topblock\"] label[aria-label*=\"Go to slide\"][class=\"dot\"]")).get(6));
        Thread.sleep(1000);

        js.executeScript("arguments[0].click();", Hooks.driver.findElements(By.cssSelector("div[class=\"sldr _img _main -rad4 -oh -fsh0 -mhm\"] a")).get(6));
    }
    @Then("check if url is changed accordingly")
    public void checkURL(){
        SoftAssert soft= new SoftAssert();
        String ActualURL = Hooks.driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(ActualURL,ExpectedURL);
    }

    @Given("users clicks on home screen logo")
    public void clickHomeLogo2(){
        slider.homePageLogo.click();
    }
    @Then("user clicks on Iphone slider")
    public void clickSecondSlider() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[aria-label=\"nivo-imageLink\"]")).click();
        Thread.sleep(1000);

        Hooks.driver.findElement(By.cssSelector("button[class=\"cls\"][aria-label=\"Close\"]")).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;

        js.executeScript("arguments[0].click();", Hooks.driver.findElements(By.cssSelector("div[id=\"sl-topblock\"] label[aria-label*=\"Go to slide\"][class=\"dot\"]")).get(6));
        Thread.sleep(1000);

        js.executeScript("arguments[0].click();", Hooks.driver.findElements(By.cssSelector("div[class=\"sldr _img _main -rad4 -oh -fsh0 -mhm\"] a")).get(6));
    }
    @Then("check if url is changed successfully")
    public void checkURL2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"nivo-slider\\\"]/a[1]")));

        SoftAssert soft= new SoftAssert();
        String ActualURL = Hooks.driver.getCurrentUrl();
        String ExpectedURL = " https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(ActualURL,ExpectedURL);
    }
}

