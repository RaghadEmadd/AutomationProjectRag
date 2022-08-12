package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void register(){
        register.registerBtn.click();
    }
    @When("user selects gender type")
    public void selectGender(){
        register.GenderBox.click();
    }
    @Then("user types his first name")
    public void TypeFirstName(){
        register.FName.sendKeys("Raghad");
    }
    @And("user types his last name")
    public void TypeLastName(){
        register.LName.sendKeys("Emad");
    }
    @Then("user selects a day")
    public void SelectDay() throws InterruptedException {
       register.Day.click();
       Select option= new Select(register.Day);
        option.selectByValue("13");
        option.selectByVisibleText("13");
        Thread.sleep(1000);
    }
    @Then("user selects a month")
    public void SelectMonth() throws InterruptedException {
       register.Month.click();
       Select option= new Select(register.Month);
        option.selectByValue("11");
        option.selectByVisibleText("November");
        Thread.sleep(1000);
    }
    @Then("user selects a year")
    public void SelectYear() throws InterruptedException {
       register.Year.click();
        Select option= new Select(register.Year);
        option.selectByValue("1995");
        option.selectByVisibleText("1995");
        Thread.sleep(1000);
    }
    @Then("user enters a valid email")
    public void TypeEmail(){
        register.email.sendKeys("rag@gmail.com");
    }
    @Then("user scrolls down")
    public void Scroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3000);
    }
    @Then("user enters a company name")
    public void EnterCompanyName(){
        register.company.sendKeys("CI Souhoola");
    }
    @Then("user enters a valid password")
    public void EnterPassword(){
        register.password.sendKeys("password1234");
    }
    @Then("user reenters the same password")
    public void ConfirmPassword(){
        register.Confirmpassword.sendKeys("password1234");
    }
    @Then("user clicks on register button")
    public void ClickRegisterButton(){
        register.RegisterButton2.click();
    }
    @Then("registration should be successful")
        public void softAssertForRegistration(){
            SoftAssert soft= new SoftAssert();
        String Actual = Hooks.driver.findElement(By.className("result")).getText();
        String Expected = "Your registration completed";
        soft.assertTrue(Actual.contains(Expected));
        //to check the color of text green#4cb17c
        WebElement t = register.result();
        //obtain color in rgba
        String s = t.getCssValue("color");
        // convert rgba to hex
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);
            soft.assertAll();
        }
    }

