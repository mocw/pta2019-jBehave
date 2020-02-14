package pl.lodz.uni.math.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pl.lodz.uni.math.ChromeDriver;

public class SingleInputForm {
    private WebElement inputTextElement;

    private WebElement submitButton;

    private WebElement resultText;

    public SingleInputForm(){
        inputTextElement = ChromeDriver.getDriver().findElement(By.xpath("//input[@id='user-message']"));
        submitButton = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button"));
        resultText = ChromeDriver.getDriver().findElement(By.xpath("//div[@id='user-message']/span"));
    }

    public WebElement getInputTextElement() {
        return inputTextElement;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public String getResultText() {
        return resultText.getText();
    }

    public void inputFormClick(){
        inputTextElement.click();
    }

    public void setInputTextElement(String text) {
        this.inputTextElement.clear();
        this.inputTextElement.sendKeys(text);
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }
}
