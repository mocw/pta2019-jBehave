import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.Checkbox;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CheckboxSteps {
    Checkbox page;

    @Given("The Google Chrome browser")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }


    @When("We go to the site http://www.seleniumeasy.com/test/basic-checkbox-demo.html")
    public void openSite(){
        ChromeDriver.navigate(Page.getPage() + "basic-checkbox-demo.html");
        page = new Checkbox();
    }

    @Then("We click on the checkbox")
    public void clickCheckbox(){
        page.setRbElement();
    }

    @Then("It should be checked $result")
    public void isChecked(@Named("result") String result){
        assertTrue(ChromeDriver.getDriver().getPageSource().contains(result));
        assertEquals("Success - Check box is checked",result);
    }

    @When("We click on the Check All button")
    public void clickCheckAllButton(){
        page.checkUncheckAllButtonClick();
    }

    @Then("Title should switch to $title")
    public void checkButtonTitle(@Named("title") String title){
        assertEquals(title,page.getCheckAllButtonText());
    }

    @Then("Close the chrome browser")
    public void closeBrowser(){
        ChromeDriver.quit();
    }

}
