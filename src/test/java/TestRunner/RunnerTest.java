package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile"},
		glue= {"Steps"},
		dryRun=false,
		monochrome=true,
		tags="@Register",
		plugin= {"html:Reports/abc.html"}
		)
public class RunnerTest {

}
