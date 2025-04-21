package org.example;

import org.openqa.selenium.By;

public class LocatorsAndConstants {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    public static final By COOKIE = By.id("rcc-confirm-button");

    //Локаторы вопросов
    public static final By QUESTION0 = By.id("accordion__heading-0");
    public static final By QUESTION1 = By.id("accordion__heading-1");
    public static final By QUESTION2 = By.id("accordion__heading-2");
    public static final By QUESTION3 = By.id("accordion__heading-3");
    public static final By QUESTION4 = By.id("accordion__heading-4");
    public static final By QUESTION5 = By.id("accordion__heading-5");
    public static final By QUESTION6 = By.id("accordion__heading-6");
    public static final By QUESTION7 = By.id("accordion__heading-7");

    //Локаторы ответов
    public static final By RESPONSE0 = By.id("accordion__panel-0");
    public static final By RESPONSE1 = By.id("accordion__panel-1");
    public static final By RESPONSE2 = By.id("accordion__panel-2");
    public static final By RESPONSE3 = By.id("accordion__panel-3");
    public static final By RESPONSE4 = By.id("accordion__panel-4");
    public static final By RESPONSE5 = By.id("accordion__panel-5");
    public static final By RESPONSE6 = By.id("accordion__panel-6");
    public static final By RESPONSE7 = By.id("accordion__panel-7");

    //Тексты ответов
    public static final String TEXT_RESPONSE0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String TEXT_RESPONSE1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String TEXT_RESPONSE2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String TEXT_RESPONSE3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String TEXT_RESPONSE4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String TEXT_RESPONSE5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String TEXT_RESPONSE6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String TEXT_RESPONSE7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //Верхняя кнопка заказать
    public static final By TOP_BUTTON_ORDER = By.className("Button_Button__ra12g");
    //Заголовок формы заказа
    public static final By ORDER_FORM_TITLE = By.className("Order_Header__BZXOb");
public static final String TEXT_ORDER_FORM_TITLE = "Для кого самокат";

//Нижняя кнопка заказать
    public static final By DOWN_BUTTON_ORDER = By.className("Button_Button__ra12g");

    //Локаторы полей формы заказа
         //имя
    public static final By FIELD_NAME = By.xpath("//input[@placeholder='* Имя']");
         //фамилия
    public static final By FIELD_SURNAME = By.xpath("//input[@placeholder='* Фамилия']");
        //Адрес
    public static final By FIELD_ADDRESS_ORDER = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
        //станция метро
    public static final By FIELD_METRO_STATION = By.className("select-search__input");
       //Выбор станции метро
     public static final By FIELD_CHOOSING_METRO_STATION = By.xpath("//div[contains(text(), 'Черкизовская')]");
        //номер телефона//
        public static final By FIELD_PHONE_NUMBER = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка далее формы заказа
    public static final By FIELD_NEXT_BUTTON = By.className("Button_Middle__1CSJM");
    //Поля формы аренды
        //форма про аренды
    public static final By ABOUT_RENT_FORM = By.className("Order_Header__BZXOb");
        //время заказа
    public static final By FIELD_ORDER_TIME = By.xpath("//input[@placeholder='* Когда привезти самокат']");
        //срок аренды
    public static final By FIELD_ORDER_TERM = By.className("Dropdown-placeholder");
        //срок аренды на сутки
    public static final By FIELD_ORDER_TERM_PER_DAY = By.xpath("//div[text()='сутки']");
        //чекбокс черный жемчуг
    public static final By CHECKBOX_BLACK_PEARL = By.id("black");
        //чекбокс черный жемчуг
    public static final By CHECKBOX_GRAY_HOPELESSNESS = By.id("grey");
        //комментарий
    public static final By FIELD_COMMENT_COURIER = By.xpath("//input[@placeholder='Комментарий для курьера']");
        //кнопка заказать(окончательная)
    public static final By BUTTON_ORDER_AFTER_FORM = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[contains(text(), 'Заказать')]");
       //форма подтверждения заказа
  public static final By ORDER_CONFIRMATION_FORM = By.className("Order_ModalHeader__3FDaJ");
      //кнопка да
  public static final By BUTTON_YES = By.xpath("//button[text()='Да']");
      //форма заказ оформлен
  public static final By ORDER_PLACED_FORM = By.xpath("//div[contains(@class, 'Order_ModalHeader__3FDaJ') and contains(text(), 'Заказ оформлен')]");



  //константа заголовка заказ оформлен
    public static final String ORDER_PLACED = "Заказ оформлен";
}


