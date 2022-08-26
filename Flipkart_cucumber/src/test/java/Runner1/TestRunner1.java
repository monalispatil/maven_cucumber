package Runner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Flipkart_cucumber\\src\\main\\resources\\Feature1\\flipkart_login.feature",
		glue = {"StepDefination1"},
		tags = "@sanity"
		)
public class TestRunner1 {

}
