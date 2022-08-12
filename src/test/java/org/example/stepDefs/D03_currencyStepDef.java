package org.example.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_currency;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class D03_currencyStepDef {
    P03_currency currency = new P03_currency();

    @Given("User Select “Euro” from currency dropdown list")
    public void selectEuro() throws InterruptedException {
        currency.currencyDropDown.click();
        Select option= new Select(currency.currencyDropDown);
        option.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        option.selectByVisibleText("Euro");
        Thread.sleep(1000);
    }
    @Then("User scrolls down to view products")
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
    }
    @Then("User can see the prices with the new selected currency successfully")
    public void viewProducts(){
        Assertion hardAssert = new Assertion();
        for (int i = 0; i <currency.products.size(); i++) {
            String expectedResults = "€";
            String actualResults = String.valueOf(Hooks.driver.findElement(By.className("price.actual-price")).getText().charAt(0));
            hardAssert.assertTrue(actualResults.contains(expectedResults));
        }
    }
}
