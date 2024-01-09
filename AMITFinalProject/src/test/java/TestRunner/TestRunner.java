package TestRunner;

import TestBase.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
                features = "src/test/resources",
                glue = "TestSteps",
                tags = "@SearchProcessTwoCase"

        )

public class TestRunner extends TestBase {
}
