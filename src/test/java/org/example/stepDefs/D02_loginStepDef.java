package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void login(){ login.loginBtn.click();}

    @Then("user login with valid email and valid password")
    public void TypeCredentials(){
        login.email.sendKeys("rag@gmail.com");
        login.password.sendKeys("password1234");
    }
    @And("user press on login button")
    public void ClickLoginButton(){
        login.login2().click();
    }
    @Then("user login to the system successfully")
    public void softAssertionForLogin(){
        SoftAssert soft= new SoftAssert();
        //Scenario 1: check url
        String ActualURL = Hooks.driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/";
        soft.assertEquals(ExpectedURL, ActualURL);
        //check if my account tab is displayed
        WebElement myAccountTab = login.myAccountTab;
        soft.assertEquals(true, myAccountTab.isDisplayed());
        soft.assertAll();

        //Scenario 2:
        //WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        //WebElement actual_msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("message-error validation-summary-errors")));
        //String actual_msg= Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']")).getText().toString();
        //soft.assertEquals(actual_msg,"Login was unsuccessful. Please correct the errors and try again.\n" +
                //"No customer account found");

        String ActualMsg = Hooks.driver.findElement(By.className("message-error.validation-summary-errors")).getText();
        String ExpectedMsg = "Login was unsuccessful. Please correct the errors and try again.";
        soft.assertTrue(ActualMsg.contains(ExpectedMsg));
        soft.assertAll();


        //to check the color of error message red #e4434b
        WebElement t = login.result2();
        //obtain color in rgba
        String s = t.getCssValue("color");
        // convert rgba to hex
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);
        soft.assertAll();
    }
}
