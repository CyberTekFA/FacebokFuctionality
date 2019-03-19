package cukesRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",glue="stepDefinations",
		plugin= {"pretty","html:target/cucumber/report"},
		monochrome=true,strict=true,dryRun=false
		)
public class FacebookRunner {

}
