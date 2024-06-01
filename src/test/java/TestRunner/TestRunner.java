package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Feature",
	glue= {"StepDefinitions"},
	plugin= {"pretty",	"html:reports/cucumber-report.html"},
	tags="",
	monochrome = true,
	dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests{

}
