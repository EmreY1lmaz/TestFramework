package com.TestCompany.pages;

import com.TestCompany.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name ="q")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"tads\"]/div[1]/div/div/div/div[1]/a/div[1]/span")
    public WebElement firstResult;
}








