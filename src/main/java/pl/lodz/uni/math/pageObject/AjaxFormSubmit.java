package pl.lodz.uni.math.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pl.lodz.uni.math.ChromeDriver;

public class AjaxFormSubmit {

    private WebElement inputName;
    private WebElement inputComment;
    private WebElement submitButton;
    private WebElement formResultText;

    public AjaxFormSubmit(){
        inputName = ChromeDriver.getDriver()
                .findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[1]/input"));
        inputComment = ChromeDriver.getDriver()
                .findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[2]/textarea"));
        submitButton = ChromeDriver.getDriver()
                .findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[3]/input"));
        formResultText = ChromeDriver.getDriver()
                .findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[3]"));
    }

    public void setSubmitButtonClick(){
        submitButton.click();
    }

    public void setInputName(String name){
        inputName.sendKeys(name);
    }

    public void setInputComment(String comment){
        inputComment.sendKeys(comment);
    }

    public boolean isResultTextSuccessfull(){
        while(true){
            if(formResultText.getText().equals("Form submited Successfully!")){
                return true;
            }
        }
    }
}
