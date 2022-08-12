package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_slider {
    public P06_slider(){PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(linkText = "/")
    public WebElement homePageLogo;
}
