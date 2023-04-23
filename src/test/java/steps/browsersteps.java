package steps;

import common.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class browsersteps {
    @Given("^user launching browser$")
    public void launchbrowser()  {
        BaseClass.launchApplication();
    }
    @When("^Type Sunny leone$")
    public void entertext(){
        //BaseClass.enterText();
    }
}
