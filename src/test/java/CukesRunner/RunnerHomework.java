package CukesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "/Users/nargizatalipova/Downloads/Cocumber/src/test/resources/WebOrderTest/NewOrderCanBeEdited.feature",
        glue = "",
        dryRun = false
)
public class RunnerHomework {


}
