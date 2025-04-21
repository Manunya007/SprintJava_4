package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.example.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class OrderScooterFoxTest {
    private WebDriver driver;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String data;
    private By checkbox;
    private String comments;


    public OrderScooterFoxTest(String name, String surname, String address, String phone, String data, By checkbox, String comments) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.data = data;
        this.checkbox = checkbox;
        this.comments = comments;
    }


    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFormFormWhomScooter() {
        return new Object[][] {
                {"Линда", "Петрова", "перевалова, 43", "89135466778", "15.05.2025", CHECKBOX_BLACK_PEARL, "домофона нет"},
                {"Петр", "Иванов", "шерементьево, 67", "89996754356", "23.08.2025", CHECKBOX_GRAY_HOPELESSNESS, ""},
        };
    }

    @Test
    public void clickOrderTopButton(){
        OrderScooterPage objectOrderScooter = new OrderScooterPage(driver);
        objectOrderScooter.getWebSite();
        objectOrderScooter.clickOrderTopButton();
        String actual = objectOrderScooter.compareButtonOrder();
        assertEquals(TEXT_ORDER_FORM_TITLE, actual);
    }

    @Test

    public void clickOrderDownButton(){
        OrderScooterPage objectOrderScooter = new OrderScooterPage(driver);
        objectOrderScooter.getWebSite();
        objectOrderScooter.clickOrderDownButton();
        String actual = objectOrderScooter.compareButtonOrder();
        assertEquals(TEXT_ORDER_FORM_TITLE, actual);
    }

    @Test
    public void orderScooter() {
        OrderScooterPage objectOrderScooter = new OrderScooterPage(driver);
        objectOrderScooter.getWebSite();
        objectOrderScooter.clickOrderDownButton();

        objectOrderScooter.checkFormOrderScooter(name, surname, address, phone, data, checkbox, comments);

        objectOrderScooter.clickButtonYes();

        String s = objectOrderScooter.compareTitleOrderPlaced();
        assertEquals(ORDER_PLACED, s);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}