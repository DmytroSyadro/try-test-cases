package com.softserve.edu.teachua.wraps.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class SearchExplicitTextCss extends SearchExplicitPresent {
    @Override
     public boolean isLocatedCss(String cssSelector){
         return getDriverWait().until(new ExpectedCondition<Boolean>() {
             public Boolean apply(WebDriver driver) {
                 WebElement element = cssSelector(cssSelector);
                 return !element.getText().isEmpty();
             }
         });
     }
}
