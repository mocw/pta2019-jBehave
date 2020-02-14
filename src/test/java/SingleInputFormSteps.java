import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.SingleInputForm;

import static org.junit.Assert.assertEquals;


public class SingleInputFormSteps  {

    private SingleInputForm page;
    @Given("The Google Chrome browser")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }

    @When("We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html")
    public void openSite(){
        ChromeDriver.navigate(Page.getPage() + "basic-first-form-demo.html");
        page = new SingleInputForm();
    }

    @Then("We click on the Textbox")
    public void clickInputForm(){
        page.inputFormClick();
    }

    @Then("We enter the text $text")
    public void enterText(@Named("text")String text){
        page.setInputTextElement("TEST");
    }

    @Then("We click submit button")
    public void submitClick(){
        page.clickSubmitButton();
    }

    @Then("We should see $result as a result")
    public void checkResult(@Named("result")String result){
        assertEquals(result,page.getResultText());
    }

    @Then("Close the chrome browser")
    public void closeBrowser(){
        //ChromeDriver.quit();
    }

}
