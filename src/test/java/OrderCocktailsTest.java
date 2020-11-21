import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderCocktailsTest {
	
	private Bar myBar;
	private Cocktail myCocktail;
	private Client client1;
	private Client client2;
	private Cocktail bill1;
	private Cocktail bill2;

	
	@Given("^the bar exists$")
	public void the_bar_exists() throws Throwable {
		myBar = new Bar();
	}

	@Given("^the cocktail of the month exists$")
	public void the_cocktail_of_the_month_exists() throws Throwable {
	    myCocktail = new Cocktail();
	}

	@Given("^the name of the first client is Leblanc$")
	public void the_name_of_the_first_client_is_Leblanc() throws Throwable {
		client1 = new Client();
	    client1.setName("Leblanc");
	}
	
	@Given("^the name of the second client name is Pignon$")
	public void the_name_of_the_second_client_name_is_Pignon() throws Throwable {
		client2 = new Client();
	    client2.setName("Pignon");
	}


	@Given("^the price of the cocktail of the month is (\\d+)$")
	public void the_price_of_the_cocktail_of_the_month_is(int arg1) throws Throwable {
	    myCocktail.setCocktailPrice(arg1);
	}

	
	@When("^the cocktails are ordered$")
	public void the_cocktails_are_ordered() throws Throwable {
		bill1 = new Cocktail();
		bill2 = new Cocktail();
	}
	
	@Then("^the name of the first client is \"([^\"]*)\" and he pays the amount of (\\d+)$")
	public void the_name_of_the_first_client_is_and_he_pays_the_amount_of(String arg1, int arg2) throws Throwable {
		Assert.assertTrue(client1.getName().equals(arg1));
		bill1.setAmount(arg2);
	}
	
	@Then("^the name of the second client is \"([^\"]*)\" and he pays the amount of (\\d+)$")
	public void the_name_of_the_second_client_is_and_he_pays_the_amount_of(String arg1, int arg2) throws Throwable {
		Assert.assertTrue(client2.getName().equals(arg1));
		bill2.setAmount(arg2);
	}

	
	@Then("^the number of rounds is (\\d+)$")
	public void the_number_of_rounds_is(int arg1) throws Throwable {
	    myCocktail.setRound(arg1);
	}
	   
	
	@Then("^\"([^\"]*)\" mood is \"([^\"]*)\"$")
	public void mood_is(String arg1, String arg2) throws Throwable {
		if (myCocktail.getRound() <= 1){
			client2.setMood("happy");
		}else{
			client2.setMood("sad");};
			Assert.assertEquals(client2.getName(),arg1);
		    Assert.assertEquals(client2.getMood(),arg2);
	}

	
}
