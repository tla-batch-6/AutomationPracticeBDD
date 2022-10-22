package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.UserMgtPage;
import utils.BrowserUtils;


public class UserMgtSteps implements CommonPage {
    UserMgtPage page;

    public UserMgtSteps(){
        page = new UserMgtPage();
    }

    @Then("Verify title of the page is Register New User")
    public void verifyTitleOfThePageIsRegisterNewUser() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(),
                "Register New User");
    }

    @Then("Verify Login button is present")
    public void verifyLoginButtonIsPresent() {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.loginBtn));
    }

    @Then("Verify First Name input field is displayed")
    public void verify_first_name_input_field_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "First Name"))
                )
        );
    }
    @Then("Verify Last Name input field is displayed")
    public void verify_last_name_input_field_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Last Name"))
                )
        );
    }
    @Then("Verify Phone Number input field is displayed")
    public void verify_phone_number_input_field_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Phone Number"))
                )
        );
    }
    @Then("Verify Email input field is displayed")
    public void verify_email_input_field_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "E-mail"))
                )
        );
    }
}
