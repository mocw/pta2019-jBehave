import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.AjaxFormSubmit;

import static junit.framework.TestCase.assertTrue;

public class AjaxFormSubmitSteps {

    private AjaxFormSubmit page;

    @Given("The Google Chrome browser")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }

    @When("We go to the site http://www.seleniumeasy.com/test/ajax-form-submit-demo.html")
    public void openSite(){
        ChromeDriver.navigate(Page.getPage() + "ajax-form-submit-demo.html");
        page = new AjaxFormSubmit();
    }

    @Then("We select input vame value $value")
    public void inputNameFildValue(@Named("value") String value){
        page.setInputName(value);
    }

    @Then("We select input comment value $content")
    public void inputCommentFieldValue(@Named("content") String content){
        page.setInputComment(content);
    }

    @Then("We click submit button")
    public void clickSubmitButton(){
        page.setSubmitButtonClick();
    }

    @Then("We wait for $text result Text")
    public void waitForResultText(@Named("content") String content){
        assertTrue(page.isResultTextSuccessfull());
        assertTrue(ChromeDriver.getDriver().getPageSource().contains(content));
    }

    @Then("Close chrome Browser")
    public void closeBrowser(){
        //ChromeDriver.quit();
    }
}
