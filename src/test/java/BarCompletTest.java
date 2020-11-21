import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BarCompletTest {
	private Bar myBar;
	
	
	@Given("^The bar exists$")
	public void BarCompleteTest(){
		myBar = new Bar();
	}
	

	@And("^The bar has limited sitting (\\d+)$")
	public void the_bar_has_limited_sitting(int arg1) throws Throwable {
	    myBar.setMaxSeats(arg1);;
	}
	
	@And("^The bar has (\\d+) limited seats$")
	public void the_bar_has_limited_seats(int arg1) throws Throwable {
		myBar.setMaxSeats(arg1);
	}
	
	@And("^(\\d+) seats are already occupied in the bar$")
	public void seats_are_already_occupied_in_the_bar(int arg1) throws Throwable {
		myBar.setOccupiedSeats(arg1);
	}

	@When("^A group of (\\d+) want to enter the bar$")
	public void a_group_of_want_to_enter_the_bar(int arg1) throws Throwable {
	    myBar.setNewClients(arg1);
	}

	
	@Then("^The status of the bar is \"([^\"]*)\"$")
	public void the_status_of_the_bar_is(String arg1) throws Throwable {
		Assert.assertEquals(myBar.checkAvailability(), arg1);
	}

	
}