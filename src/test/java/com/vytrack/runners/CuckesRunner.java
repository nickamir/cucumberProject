package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
    plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false

      //we can "tag" scenarios, to easily find them and run them seperately
        ///tags = "@login" //"sales_manager"  //runs scenario under name of this tag  only

)
public class CuckesRunner {

}
