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
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.example.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderScooterTest extends BaseTest {
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String data;
    private By checkbox;
    private String comments;
    private By buttonOrder;

    public OrderScooterTest(By buttonOrder, String name, String surname, String address, String phone, String data, By checkbox, String comments) {
        this.buttonOrder = buttonOrder;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.data = data;
        this.checkbox = checkbox;
        this.comments = comments;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFormFormWhomScooter() {
        return new Object[][] {
                {TOP_BUTTON_ORDER, "Линда", "Петрова", "перевалова, 43", "89135466778", "15.05.2025", CHECKBOX_BLACK_PEARL, "домофона нет"},
                {DOWN_BUTTON_ORDER, "Петр", "Иванов", "шерементьево, 67", "89996754356", "23.08.2025", CHECKBOX_GRAY_HOPELESSNESS, ""},
        };
    }

    @Test
    public void orderScooter() {
        OrderScooterPage objectOrderScooter = new OrderScooterPage(driver);
        objectOrderScooter.getWebSite();
        objectOrderScooter.checkFormOrderScooter(buttonOrder, name, surname, address, phone, data, checkbox, comments);
        objectOrderScooter.clickButtonYes();

        String s = objectOrderScooter.compareTitleOrderPlaced();
        assertEquals(ORDER_PLACED, s);
    }
}