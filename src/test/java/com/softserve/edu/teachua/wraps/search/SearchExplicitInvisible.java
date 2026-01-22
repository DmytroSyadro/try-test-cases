package com.softserve.edu.teachua.wraps.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class SearchExplicitInvisible extends SearchExplicitPresent{
    public boolean isInvisibleCss(String text, String css){
        return getDriverWait().until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                List<WebElement> allElements = driver.findElements(By.cssSelector(css));
                String firstElement = allElements.isEmpty() ? "" : allElements.get(0).getText();
                return !firstElement.contains(text);
            }
        });
    }
}
