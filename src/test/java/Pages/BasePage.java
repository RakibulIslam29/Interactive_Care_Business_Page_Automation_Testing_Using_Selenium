package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    public void writeText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

//    public boolean visible(WebElement element) {
//        try {
//            WebDriverWait wait = new WebDriverWait(getDriver(), 10); 
//            wait.until(ExpectedConditions.visibilityOf(element));
//            return true; 
//        } catch (Exception e) {
//            return false; 
//        }
//    }

    public void navigateTo(String url) {
        getDriver().get(url);
    }

    public void selectDropdownByVisibleText(By locator, String visibleText) {
        WebElement dropdownElement = getElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectDropdownByValue(By locator, String value) {
        WebElement dropdownElement = getElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }

    public void selectDropdownByIndex(By locator, int index) {
        WebElement dropdownElement = getElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    public void visibleText(By locator, String visibleText) {
        WebElement dropdownElement = getElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }
}
