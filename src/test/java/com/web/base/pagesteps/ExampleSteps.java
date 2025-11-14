package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.PageElementModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.web.base.utils.driver.Driver;

import static com.web.base.pages.BaseMasterPage.USER_Guvenlikkodu;

public class ExampleSteps extends BaseSteps {

    private static final String USER_TC = "12345678901";
    private static final String USER_PASSWORD = "123456";

    @Step("Click Login button")
    public void clickLoginButton() {
        WebElement loginBtn = Driver.webDriver.findElement(
                By.xpath("//a[contains(text(),'Giriş') or contains(@href,'giris')]"));
        loginBtn.click();
    }

    @Step("Enter TC and Password")
    public void enterCredentials() {
        WebElement tcField = Driver.webDriver.findElement(By.id("tridField"));
        WebElement pwField = Driver.webDriver.findElement(By.id("egpField"));

        tcField.clear();
        tcField.sendKeys(USER_TC);

        pwField.clear();
        pwField.sendKeys(USER_PASSWORD);

        try {
            Thread.sleep(1000);
            WebElement errorLabel = Driver.webDriver.findElement(By.id("tck_error"));
            String errorText = errorLabel.getText();
            if (errorText.contains("T.C. Kimlik numaranızı hatalı girdiniz.")) {
                System.out.println("✅ Hata mesajı doğru görüntülendi: " + errorText);
            } else {
                throw new AssertionError("⚠️ Beklenen hata mesajı görüntülenmedi. Gelen: " + errorText);
            }
        } catch (Exception e) {
            System.out.println("⚠️ Hata mesajı bulunamadı veya görünür değil.");
        }
    }

    @Step("Enter CAPTCHA")
    public void enterCaptcha() {
        WebElement captchaField = Driver.webDriver.findElement(By.id("captchaField"));
        captchaField.clear();
        captchaField.sendKeys(USER_Guvenlikkodu);
    }

    @Step("Click login submit button")
    public void clickLoginSubmit() {
        BeinButton submitBtn = new BeinButton(PageElementModel.selectorNames.CLASS_NAME, "btn-send");
        submitBtn.scrollToElement();
        submitBtn.click();
    }


}