package com.softserve.edu.teachua.wraps.search;

import org.checkerframework.checker.units.qual.Luminance;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchExplicitInvisible extends SearchExplicitPresent{
    private int amount = 0;
    @Override
    public boolean isInvisible(WebElement element) {
        return getDriverWait().until(ExpectedConditions.stalenessOf(element));
    }

    @Override
    public boolean isInvisibleCss(String cssSelector, String text){
        return getDriverWait().until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                List<WebElement> elements = driver.findElements(By.cssSelector(cssSelector));
                return !elements.get(0).getText().contains(text)||(amount++>0);
            }
        });
    }
}
