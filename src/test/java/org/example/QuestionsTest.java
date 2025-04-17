package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.example.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class QuestionsTest {
    private WebDriver driver;
    private By question;
    private By response;
    private String textResponse;

    public QuestionsTest(By question, By response, String textResponse) {
        this.question = question;
        this.response = response;
        this.textResponse = textResponse;
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getResponse() {
        return new Object[][] {
                {QUESTION0, RESPONSE0, TEXT_RESPONSE0},
                {QUESTION1, RESPONSE1, TEXT_RESPONSE1},
                {QUESTION2, RESPONSE2, TEXT_RESPONSE2},
                {QUESTION3, RESPONSE3, TEXT_RESPONSE3},
                {QUESTION4, RESPONSE4, TEXT_RESPONSE4},
                {QUESTION5, RESPONSE5, TEXT_RESPONSE5},
                {QUESTION6, RESPONSE6, TEXT_RESPONSE6},
                {QUESTION7, RESPONSE7, TEXT_RESPONSE7},
        };
    }

    @Test
    public void openQuestions() {
        QuestionsPage objQuestion = new QuestionsPage(driver);
        objQuestion.getWebsiteAndClickCookie();
        objQuestion.scrollQuestions();

        objQuestion.clickQuestions(question, response);

        String actual = objQuestion.compareQuestions(response);
        assertEquals(textResponse, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}