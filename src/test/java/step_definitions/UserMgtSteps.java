package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BrowserUtils;

public class UserMgtSteps {

    @Then("Verify title of the page is Register New User")
    public void verifyTitleOfThePageIsRegisterNewUser() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(),
                "Register New User");
    }
}
