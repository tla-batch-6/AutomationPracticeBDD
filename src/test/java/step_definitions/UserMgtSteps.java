package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;


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

    @Then("Verify following input fields are displayed:")
    public void verify_following_input_fields_are_displayed(List<String> dataTable) {
        for(String each: dataTable){
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, each))
                    )
            );
        }
    }
}
