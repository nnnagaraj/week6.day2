package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
import steps.HooksImplementation;

@CucumberOptions(features = { "src/test/java/features" }, glue = "steps", monochrome = true, publish = true)

public class CucumberRunner extends BaseClass {

}