package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/features",
        glue="steps",
        plugin="html:target/cucumber-html-report",
        tags= "@regression"

)
public class TestRunner {

}
