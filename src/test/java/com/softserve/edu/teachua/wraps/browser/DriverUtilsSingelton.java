package com.softserve.edu.teachua.wraps.browser;


import com.softserve.edu.teachua.tools.PropertiesUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.text.AbstractDocument;

public class DriverUtilsSingelton {
    private static DriverUtilsSingelton instance = null;


    private static final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss-S";
    private static final String LOCALSTORAGE_REMOVE_ITEM = "window.localStorage.removeItem('%s');";
    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    private static Browsers browserDefault;


    private DriverUtilsSingelton(){
        initDriver();
    }

    private static DriverUtilsSingelton get(){
        if(instance == null){
            synchronized (DriverUtilsSingelton.class){
                if(instance == null){
                    instance = new DriverUtilsSingelton();
                }
            }
        }
        return instance;
    }

    private void initDriver(){
        String browser = PropertiesUtils.get().readBrowserName();
        if(browser.equals(PropertiesUtils.ERROR_READ_PROPERTY)){
            browserDefault = Browsers.DEFAULT_TEMPORARY;
        }else{
            browserDefault =getBrowserByPartialName(browser);
        }
    }
    private static Browsers getBrowserByPartialName(String browserName) {
        Browsers browser = Browsers.DEFAULT_TEMPORARY;
        browserName = browserName.toLowerCase()
                .replaceAll("[_-]", " ")
                .replaceAll("[ ]+", " ")
                .trim();
        for (Browsers current : Browsers.values()) {
            String currentName = current.name().toLowerCase().replace("_", " ");
            if (currentName.contains(browserName)) {
                browser = current;
                break;
            }
        }
        return browser;
    }

    public static WebDriver addDriver(Browsers browser) {
        WebDriver driver = browser.runBrowser();
        drivers.set(driver);
        return driver;
    }

    public static WebDriver getDriver() {
        WebDriver driver = drivers.get();
        //
        if (driver == null) {
            driver = addDriver(browserDefault);
        }
        return driver;
    }
    public void scrollToElement(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void quit(){
        if(getDriver()!= null ){
            getDriver().quit();
        }
    }








}
