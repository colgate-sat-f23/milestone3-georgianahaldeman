package project.system;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import project.system.pages.HomeWebPage;

public class RetrieveTODOsFlowTest {
    protected static WebDriver driver = new SafariDriver();
    private HomeWebPage page = new HomeWebPage(driver);
    
    @Test 
    void retrieveTodoMultipleTest(){
        //page.retrieveTodos("tony-stark");
        page.visit();
        page.retrieveTodos("tony-stark");
        //driver.get("http://localhost:8080");
        page.isReady();
        System.out.println(page.retrieveTodos());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!! end of test");
    }

}
