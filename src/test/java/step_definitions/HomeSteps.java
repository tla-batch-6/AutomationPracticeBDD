package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    public HomeSteps(){
        page = new HomePage();
    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify header text is Automation with Selenium")
    public void verify_header_text_is_automation_with_selenium() {
        BrowserUtils.assertEquals(page.headerTitle.getText(), "Automation with Selenium");
    }

    @Then("Verify button Home is displayed")
    public void verify_button_home_is_displayed() {
        BrowserUtils.isEnabled(page.homeLinkText);
    }

    @Then("Verify button Calendar is displayed")
    public void verify_button_calendar_is_displayed() {
        BrowserUtils.isEnabled(page.calendarBtn);
    }

    @Then("Verify button UserMgt is displayed")
    public void verify_button_user_mgt_is_displayed() {
        BrowserUtils.isEnabled(page.userMgtBtn);
    }

    @Then("Verify button Others is displayed")
    public void verify_button_others_is_displayed() {
        BrowserUtils.isEnabled(page.othersBtn);
    }

    @Then("Verify button Tables is displayed")
    public void verifyButtonTablesIsDisplayed() {
        BrowserUtils.isEnabled(page.tablesLinkText);
    }

    @Then("Verify button Synchronization is displayed")
    public void verifyButtonSynchronizationIsDisplayed() {
        BrowserUtils.isEnabled(page.synchronizationLinkText);
    }

    @Then("Verify button iFrames is displayed")
    public void verifyButtonIFramesIsDisplayed() {
        BrowserUtils.isEnabled(page.iframesLinkText);
    }

    @When("I click a button Others")
    public void i_click_a_button_others() {
        BrowserUtils.click(page.othersBtn);
    }

    @When("I click a button Calendar")
    public void i_click_a_button_calendar() {
        BrowserUtils.click(page.calendarBtn);
    }

    @When("I click a button User-Mgt")
    public void iClickAButtonUserMgt() {
        BrowserUtils.click(page.userMgtBtn);
    }

    @When("I click a button Pop-Up")
    public void iClickAButtonPopUp() {
        BrowserUtils.click(page.popUpBtn);
    }

}
