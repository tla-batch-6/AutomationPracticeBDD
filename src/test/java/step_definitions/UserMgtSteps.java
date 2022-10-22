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

    @Then("Verify {string} input field is displayed")
    public void verifyInputFieldIsDisplayed(String inputField) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, inputField))
                )
        );
    }

}
