package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.P05_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D05_hoverStepDef {
    P05_homepage hover=new P05_homepage();

    @Given("users clicks on home screen logo")
    public void clickHomeLogo(){
        hover.homePageLogo.click();
    }
    @Then("hover on any category")
    public void hoverCategory(){
        WebElement mainCategory = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(mainCategory);
        WebElement subcategory = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a"));
        actions.moveToElement(subcategory);
        actions.click().build().perform();
    }
    @Then("click on first element")
    public void clickOnFirstElement(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a")).click();
    }
    @Then("check that clicking is successful")
    public void checkClickSuccess(){
        List<WebElement> headers = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
        for (WebElement header : headers) {
            ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true);", header);
            System.out.println(header.getText());
        }
            SoftAssert soft = new SoftAssert();
            String Actual = String.valueOf(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")));
            String Expected = "https://demo.nopcommerce.com/search?q=";
            soft.assertTrue(Actual.contains(Expected));
        }

}
