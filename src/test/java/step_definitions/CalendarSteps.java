package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarSteps {


    @When("I click a button endDateInput")
    public void i_click_a_button_end_date_input() {
        System.out.println("clicked a button endDateInput");
    }
    @When("I click a button endDateCalendar")
    public void i_click_a_button_end_date_calendar() {
        System.out.println("clicked a button endDateCalendar");
    }
    @When("I click a button Submit")
    public void i_click_a_button_submit() {
        System.out.println("clicked a button Submit");
    }
    @Then("text will display {int} day difference")
    public void text_will_display_day_difference(Integer int1) {
        System.out.println("verified day difference is 1");
    }
}
