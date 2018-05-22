

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@CucumberOptions(monochrome=true,
dryRun=false,
features={"src/test/resources/featurefile/"},
glue={"com/AutomationPractice/stepdefinition/"},

plugin={"pretty",
"html:target/cucumber-reports/cucumber-pretty",
"json:target/cucumber-reports/CucumberTestReport.json",
"rerun:target/cucumber-reports/rerun.txt",
"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
})
public class CukeRunner extends AbstractTestNGCucumberTests{
	
	
}
