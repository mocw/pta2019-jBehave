import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.Checkbox;
import pl.lodz.uni.math.pageObject.MultiInputForm;

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


}
