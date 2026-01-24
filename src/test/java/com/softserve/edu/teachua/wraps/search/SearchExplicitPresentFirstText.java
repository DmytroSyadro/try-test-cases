package com.softserve.edu.teachua.wraps.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class SearchExplicitPresentFirstText extends SearchExplicitPresent {
    @Override
    public boolean isLocated(By by){
        return getDriverWait().until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                List<WebElement> elements = driver.findElements(by);
                return !elements.get(0).getText().isEmpty();
            }
        });
    }
}
