package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.BrowserUtils;

public class MultipleWindowSteps implements CommonPage {

    @Then("Verify link text Launch TLA is displayed")
    public void verify_link_text_launch_tla_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_LINKTEXT,"Launch TLA")
                ))
        );
    }

    @Then("Verify link text Launch Google is displayed")
    public void verify_link_text_launch_google_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_LINKTEXT,"Launch Google")
                ))
        );
    }

    @Then("Verify link text Launch Facebook is displayed")
    public void verify_link_text_launch_facebook_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_LINKTEXT,"Launch Facebook")
                ))
        );
    }
}
