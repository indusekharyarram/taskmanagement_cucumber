package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags= {"@tc04_d_print"},
		glue= {"steps"},
		monochrome = true 
		)
public class d_print {

}
