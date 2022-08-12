package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_currency {

    public P03_currency(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "customerCurrency")
    public WebElement currencyDropDown;
    @FindBy(className = "item-box")
    public List<WebElement> products;
}
