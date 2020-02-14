import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.SearchFilter;

import java.util.List;

public class SearchFilterSteps {
    private SearchFilter page;

    @Given("The Google Chrome browser")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }

    @When("We go to the site http://www.seleniumeasy.com/test/table-search-filter-demo.html")
    public void openSite(){
        ChromeDriver.navigate(Page.getPage() + "table-search-filter-demo.html");
        page = new SearchFilter();
    }
}
