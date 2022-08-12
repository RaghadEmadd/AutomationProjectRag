package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_followUs {
    public P07_followUs(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")
    public WebElement FacebookLogo;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")
    public WebElement TwitterLogo;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")
    public WebElement RSSLogo;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")
    public WebElement YoutubeLogo;
}
