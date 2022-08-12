package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public  P02_login(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className="ico-login")
    public WebElement loginBtn;
    @FindBy(className="email")
    public WebElement email;
    @FindBy(className="password")
    public WebElement password;

   @FindBy(className = "ico-account")
    public WebElement myAccountTab;

   // @FindBy(className = "message-error.validation-summary-errors")
    //public WebElement UnsuccessfulLogin;

    public WebElement login2(){
        return Hooks.driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
    }

    public WebElement result2(){
        return Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']"));
    }

}
