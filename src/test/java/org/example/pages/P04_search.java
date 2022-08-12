package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P04_search {
    public  P04_search(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(id ="small-searchterms")
    public WebElement searchField;
    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    public WebElement searchBtn;
    @FindBy(className ="item-grid")
    public List<WebElement> items;
    //items that appear after searching
    @FindBy(className = "product-item")
    public List<WebElement> productItems;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    public  WebElement SKUResult;
}
