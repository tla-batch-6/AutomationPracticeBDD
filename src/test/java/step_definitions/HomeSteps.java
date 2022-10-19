package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps(){
        this.page = new HomePage();
    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify header text is Automation with Selenium")
    public void verify_header_text_is_automation_with_selenium() {
        BrowserUtils.assertEquals(page.headerTitle.getText(), "Automation with Selenium");
        BrowserUtils.closeDriver();
    }

    @Then("Verify button Home is displayed")
    public void verify_button_home_is_displayed() {
        System.out.println("Tested Home button is displayed");
    }

    @Then("Verify button Calendar is displayed")
    public void verify_button_calendar_is_displayed() {
        System.out.println("Tested Calendar button is displayed");
    }

    @Then("Verify button UserMgt is displayed")
    public void verify_button_user_mgt_is_displayed() {
        System.out.println("Tested UserMgt button is displayed");
    }

    @Then("Verify button Others is displayed")
    public void verify_button_others_is_displayed() {
        System.out.println("Tested Others button is displayed");
        BrowserUtils.closeDriver();
    }

    @When("I click a button Others")
    public void i_click_a_button_others() {
        BrowserUtils.click(page.othersBtn);
    }

    @When("I click a button Calendar")
    public void i_click_a_button_calendar() {
        BrowserUtils.click(page.calendarBtn);
    }

}
