# CucumberBDDFramework
BEGINNERS
* Step 1 - Create a new maven project
Step 2 - Add maven dependencies
  Cucumber Java | Cucumber JUnit | JUnit | Selenium Java
Step 3 - Create a folder Features under src/test/resources
Step 4 - Under features folder create a new feature file login.feature
Step 5 - Download cucumber plugin from Eclipse Marketplace
Step 6 - Create feature file and add contents
Feature
Scenario
Steps
Scenario Outline
Example
Tags
Comments
Step 7 - Try to run the feature file
Step 8 - Add Step Definitions / Glue Code under src/test/java package
Step 9 - Create a Runner class

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"})
public class TestRunner {
}

monochrome = true

plugin = { "pretty", "html:target/reports"}
plugin = { "pretty", "json:target/reports/cucumber.json"}
plugin = { "pretty",  "junit:target/reports/cucumber.xml"}

tags="@smoketest"

Step 10 - Create Add Cucumber Options for generating reports
   HTML | JSON | JUNIT/XML   
Step 11 - Run and verify results
{Step 1 - Add Selenium Java maven dependency
Step 2 - Create a feature file and add Scenario and Steps
Step 3 - Create Step Definition/Glue Code for the steps
Step 4 - Download browser driver files 
Step 5 - Add Selenium WebDriver code
Step 6 - Run Feature file and check the execution}
