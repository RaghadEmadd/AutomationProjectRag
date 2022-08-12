package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_followUs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followUs follow= new P07_followUs();

    @Given("user scrolls to end of page")
    public void scrollToEnd(){
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Then("user clicks on facebook logo")
    public void clickFacebook(){
        follow.FacebookLogo.click();
    }
    @Then("user check navigation to facebook successfully")
    public void CheckFacebookNav(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        // SoftAssert soft= new SoftAssert();
        //String actualUrl = Hooks.driver.getCurrentUrl();
        //String Expected = "Your registration completed";
        //soft.assertTrue(actualUrl.contains(Expected));
    }
    @Given("user scrolls to end of page")
    public void scrollToEnd2(){
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Then("user clicks on twitter logo")
    public void clickTwitter(){
        follow.FacebookLogo.click();
    }
    @Then("user check navigation to twitter successfully")
    public void CheckTwitterNav(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        // SoftAssert soft= new SoftAssert();
        //String actualUrl = Hooks.driver.getCurrentUrl();
        //String Expected = "Your registration completed";
        //soft.assertTrue(actualUrl.contains(Expected));
    }
    //for rss scenario
    @Given("user scrolls to end of page")
    public void scrollToEnd3(){
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Then("user clicks on rss logo")
    public void clickRSS(){
        follow.RSSLogo.click();
    }
    @Then("user check navigation to rss succcessfully")
    public void CheckRSSNav(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        // SoftAssert soft= new SoftAssert();
        //String actualUrl = Hooks.driver.getCurrentUrl();
        //String Expected = "Your registration completed";
        //soft.assertTrue(actualUrl.contains(Expected));
    }
    //for youtube scenario
    @Given("user scrolls to end of page")
    public void scrollToEnd4(){
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Then("user clicks youtube logo")
    public void clickYoutube(){
        follow.YoutubeLogo.click();
    }
    @Then("user check navigation to youtube successfully")
    public void CheckYoutubeNav(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        // SoftAssert soft= new SoftAssert();
        //String actualUrl = Hooks.driver.getCurrentUrl();
        //String Expected = "Your registration completed";
        //soft.assertTrue(actualUrl.contains(Expected));
    }

    }

