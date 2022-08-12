package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    public  P01_register(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className="ico-register")
    public WebElement registerBtn;
    @FindBy(className="female")
    public WebElement GenderBox;
    @FindBy(id="FirstName")
    public WebElement FName;
    @FindBy(id="LastName")
    public WebElement LName;
    @FindBy(name="DateOfBirthDay")
    public WebElement Day;
    @FindBy(name="DateOfBirthMonth")
    public WebElement Month;
    @FindBy(name="DateOfBirthYear")
    public WebElement Year;
    @FindBy(id="Email")
    public WebElement email;
    @FindBy(id="Company")
    public WebElement company;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(id="ConfirmPassword")
    public WebElement Confirmpassword;
    @FindBy(id="register-button")
    public WebElement RegisterButton2;
    //for result after registration
    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
