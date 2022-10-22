package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    @Then("Verify header text is {string}")
    public void verifyHeaderTextIs(String headerTxt) {
        WebElement element = null;

        switch (headerTxt.toLowerCase()){
            case "automation with selenium": element = page.headerTitle;
            break;
            default:
                System.out.println("WebElement is not defined");
        }

        BrowserUtils.assertEquals(element.getText(), headerTxt);
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button)))
        );
    }

    @When("I click a button Others")
    public void i_click_a_button_others() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Others")))
        );
    }

    @When("I click a button Calendar")
    public void i_click_a_button_calendar() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Calendar")))
        );
    }

    @When("I click a button User-Mgt")
    public void iClickAButtonUserMgt() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "User-Mgt")))
        );
    }

    @When("I click a button Pop-Up")
    public void iClickAButtonPopUp() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Pop-Up")))
        );
    }

    //TODO: Update link text related steps with this new step
    @Then("Verify link text Home is displayed")
    public void verifyLinkTextHomeIsDisplayed() {

    }

    @When("I click a button Multiple Window")
    public void iClickAButtonMultipleWindow() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Multiple-window")))
        );
    }



}
