import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.lodz.uni.math.ChromeDriver;
import pl.lodz.uni.math.Page;
import pl.lodz.uni.math.pageObject.SearchFilter;

import static org.junit.Assert.assertEquals;

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

    @Then("We set $id id input value")
    public void setIdInputValueI(@Named("id") String id) {
        page.setIdInputValue(id);
    }

    @Then("We check if row with $id id cell shows")
    public void checkIdCellValue(@Named("id") String id){
        assertEquals(id,page.getIdCellValue());
    }

    @Then("We set $task task input value")
    public void setTaskInputValue(@Named("task") String task){
        page.setTaskInputValue(task);
    }

    @Then("We check if row with $task task cell shows")
    public void checkAssigneeCellValue(@Named("task") String task){
        assertEquals(task,page.getAssigneeCellValue());
    }

    @Then("We close Chrome Browser")
    public void closeBrowser(){
        //ChromeDriver.quit();
    }
}
