package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P04_search search = new P04_search();

    @Given("user clicks on search field")
    public void clickSearchField(){
        search.searchField.click();
    }
    @Then("user does something")
    public void typeProductName1(String productName){System.out.println("typing in next step");}
    @Then("^user types (.*)$")
    public void typeProductName(String productName){
        search.searchField.sendKeys(productName);
    }
    @When("user clicks on search button")
    public void clickSearchButton(){
        search.searchBtn.click();
    }
    @Then("products are shown successfully")
    public void checkSearchWithProductName(){
        SoftAssert soft= new SoftAssert();
        //Scenario 1: check url
        String ActualURL = Hooks.driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(ActualURL.contains(ExpectedURL));
        int count=0;
        for (int i = 0; i <search.items.size() ; i++) {
            count++;
        }
        System.out.println(count);
    }
    @Given("user clicks on search field1")
    public void clickSearchField1(){
        search.searchField.click();
    }
    @Then("user does something")
    public void typeSKU1(String SKU){System.out.println("typing in next step");}
    @Then("^user types (.*)$")
        public void typeSKU(String SKU){search.searchField.sendKeys(SKU);
        search.searchBtn.click();}
    @Then("check results")
    public void checkSearchWithSKU(){
        SoftAssert soft= new SoftAssert();
        String ActualURL = Hooks.driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(ActualURL.contains(ExpectedURL));
    }
    @Then("click on result")
    public void clickOnResult(){
        search.SKUResult.click();
    }
}
