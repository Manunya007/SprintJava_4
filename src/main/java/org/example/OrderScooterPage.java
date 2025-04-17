package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.LocatorsAndConstants.*;

public class OrderScooterPage {
    private WebDriver driver;

public OrderScooterPage(WebDriver driver){

    this.driver = driver;
}
//переход на сайт
public void getWebSite() {
    driver.get(URL);
    driver.findElement(COOKIE).click();
}
//нажать на нижнюю кнопку заказать
public void clickOrderDownButton() {
    driver.findElement(DOWN_BUTTON_ORDER).click();
}

//нажать на верхнюю кнопку заказать
public void clickOrderTopButton(){
    driver.findElement(TOP_BUTTON_ORDER).click();
}
public String compareButtonOrder() {

    return driver.findElement(ORDER_FORM_TITLE).getText();
}
//заполнение формы "для кого самокат"
public void checkFormOrderScooter(String name, String surname, String address, String phone, String data, By checkbox, String comments) {
    driver.findElement(FIELD_NAME).sendKeys(name);
    driver.findElement(FIELD_SURNAME).sendKeys(surname);
    driver.findElement(FIELD_ADDRESS_ORDER).sendKeys(address);
    driver.findElement(FIELD_METRO_STATION).click();
    driver.findElement(FIELD_CHOOSING_METRO_STATION).click();
    driver.findElement(FIELD_PHONE_NUMBER).sendKeys(phone);
    driver.findElement(FIELD_NEXT_BUTTON).click();

    //ожидание между формами заказа
    // public void waitBetweenOrderForms(By elements) {
    //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    //      wait.until(ExpectedConditions.elementToBeClickable(elements));

    //форма для кого самокат
    driver.findElement(FIELD_ORDER_TIME).sendKeys(data);
    driver.findElement(ABOUT_RENT_FORM).click();
    driver.findElement(FIELD_ORDER_TERM).click();
    driver.findElement(FIELD_ORDER_TERM_PER_DAY).click();
    driver.findElement(checkbox).click();
    driver.findElement(FIELD_COMMENT_COURIER).sendKeys(comments);
    driver.findElement(BUTTON_ORDER_AFTER_FORM).click();
}


//кнопка подтверждения заказа
public void clickButtonYes(){
    driver.findElement(BUTTON_YES).click();
}
//форма заказ оформлен
public String compareTitleOrderPlaced() {
    return driver.findElement(ORDER_PLACED_FORM).getText().split("\n")[0];
}
}
