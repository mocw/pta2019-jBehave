import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.MultiInputForm;

import static org.junit.Assert.assertEquals;

public class MultiInputFormSteps {

    private MultiInputForm page;

    @Given("The Google Chrome browser")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }

    @When("We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html")
    public void openSite(){
        ChromeDriver.navigate(Page.getPage() + "basic-first-form-demo.html");
        page = new MultiInputForm();
    }

    @Then("We select input a field and We put value $value")
    public void inputFieldAValue(@Named("value") String value){
        page.setInputAField(value);
    }

    @Then("We select input b field and We put value $value")
    public void inputFieldBValue(@Named("value") String value){
        page.setInputBField(value);
    }

    @Then("We click Get Total button")
    public void clickGetTotalButton(){
        page.clickSubmitButton();
    }

    @Then("We should a+b result")
    public void checkResult(){
        ChromeDriver.await();
        assertEquals("3",page.getResultText());
    }

    @Then("Close chrome Browser")
    public void closeBrowser(){
        ChromeDriver.quit();
    }

}
