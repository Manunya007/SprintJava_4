package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.LocatorsAndConstants.*;

public class QuestionsPage {
    private WebDriver driver;


    public QuestionsPage(WebDriver driver){

        this.driver = driver;
    }

    public void getWebsiteAndClickCookie() {
        driver.get(URL);
        driver.findElement(COOKIE).click();
    }
//скролл до вопросов
    public void scrollQuestions(){
        WebElement element = driver.findElement(QUESTION0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestions(By setQuestion, By setResponse){
        driver.findElement(setQuestion).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(setResponse));}

    public String compareQuestions(By setResponse) {

        return driver.findElement(setResponse).getText();
    }



}

