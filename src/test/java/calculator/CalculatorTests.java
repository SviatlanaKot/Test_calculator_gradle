package calculator;

import pages.CalculatorAndroidPage;
import mobile.MobileFactory;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class CalculatorTests {
    private static AndroidDriver driver;
    private static CalculatorAndroidPage calculatorPage;

    @BeforeAll
    public static void setUp() {
        driver = MobileFactory.getAndroidDriver();
        calculatorPage = new CalculatorAndroidPage(driver);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Test
    @DisplayName("Проверка сложения")
    public void additionTest() {
        calculatorPage.click_1()
                .click_add()
                .click_9()
                .click_eq();

        String result = driver.findElement(By.id("result_final")).getText();

        Assertions.assertEquals("10", result);
    }

    @Test
    @DisplayName("Проверка сложения с 0")
    public void additionWithNullTest() {
        calculatorPage.click_2()
                .click_add()
                .click_0()
                .click_eq();

        String result = driver.findElement(By.id("result_final")).getText();

        Assertions.assertEquals("2", result);
    }

    @Test
    @DisplayName("Проверка сложения больше двух чисел")
    public void additionOfFourNumbersTest() {
        calculatorPage.click_2()
                .click_add()
                .click_3()
                .click_add()
                .click_4()
                .click_add()
                .click_8()
                .click_eq();

        String result = driver.findElement(By.id("result_final")).getText();

        Assertions.assertEquals("17", result);
    }

    @Test
    @DisplayName("Проверка сложения дробных чисел")
    public void additionOfFractionalNumbersTest() {
        calculatorPage.click_0()
                .click_point()
                .click_1()
                .click_add()
                .click_9()
                .click_point()
                .click_1()
                .click_eq();

        String result = driver.findElement(By.id("result_final")).getText();

        Assertions.assertEquals("9.2", result);
    }

    @Test
    @DisplayName("Проверка вычитания")
    public void subtractionTest() {
        calculatorPage.click_6()
                .click_sub()
                .click_6()
                .click_eq();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assertions.assertEquals("0", result);
    }

    @Test
    @DisplayName("Проверка вычитания с 0")
    public void subtractionWithNullTest() {
        calculatorPage.click_5()
                .click_sub()
                .click_0()
                .click_eq();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assertions.assertEquals("5", result);
    }

    @Test
    @DisplayName("Проверка умножения")
    public void multiplicationTest() {
        calculatorPage.click_3()
                .click_6()
                .click_mult()
                .click_4()
                .click_eq();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assertions.assertEquals("144", result);
    }

    @Test
    @DisplayName("Проверка деления")
    public void divisionTest() {
        calculatorPage.click_7()
                .click_8()
                .click_div()
                .click_6()
                .click_eq();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assertions.assertEquals("13", result);
    }
}
