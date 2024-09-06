package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorAndroidPage extends BasePage {

    @FindBy(id = "digit_0")
    private WebElement digit_0;
    @FindBy(id = "digit_1")
    private WebElement digit_1;
    @FindBy(id = "digit_2")
    private WebElement digit_2;
    @FindBy(id = "digit_3")
    private WebElement digit_3;
    @FindBy(id = "digit_4")
    private WebElement digit_4;
    @FindBy(id = "digit_5")
    private WebElement digit_5;
    @FindBy(id = "digit_6")
    private WebElement digit_6;
    @FindBy(id = "digit_7")
    private WebElement digit_7;
    @FindBy(id = "digit_8")
    private WebElement digit_8;
    @FindBy(id = "digit_9")
    private WebElement digit_9;
    @FindBy(id = "dec_point")
    private WebElement point;
    @FindBy(id = "op_add")
    private WebElement add;
    @FindBy(id = "op_sub")
    private WebElement subtract;
    @FindBy(id = "op_mul")
    private WebElement multiply;
    @FindBy(id = "op_div")
    private WebElement divide;
    @FindBy(id = "eq")
    private WebElement equals_;

    public CalculatorAndroidPage(AndroidDriver driver) {
        super(driver);
    }

    public CalculatorAndroidPage click_0() {
        digit_0.click();
        return this;
    }

    public CalculatorAndroidPage click_1() {
        digit_1.click();
        return this;
    }

    public CalculatorAndroidPage click_2() {
        digit_2.click();
        return this;
    }

    public CalculatorAndroidPage click_3() {
        digit_3.click();
        return this;
    }

    public CalculatorAndroidPage click_4() {
        digit_4.click();
        return this;
    }

    public CalculatorAndroidPage click_5() {
        digit_5.click();
        return this;
    }

    public CalculatorAndroidPage click_6() {
        digit_6.click();
        return this;
    }

    public CalculatorAndroidPage click_7() {
        digit_7.click();
        return this;
    }

    public CalculatorAndroidPage click_8() {
        digit_8.click();
        return this;
    }

    public CalculatorAndroidPage click_9() {
        digit_9.click();
        return this;
    }

    public CalculatorAndroidPage click_point() {
        point.click();
        return this;
    }

    public CalculatorAndroidPage click_add() {
        add.click();
        return this;
    }

    public CalculatorAndroidPage click_sub() {
        subtract.click();
        return this;
    }

    public CalculatorAndroidPage click_mult() {
        multiply.click();
        return this;
    }

    public CalculatorAndroidPage click_div() {
        divide.click();
        return this;
    }

    public CalculatorAndroidPage click_eq() {
        equals_.click();
        return this;
    }
}

