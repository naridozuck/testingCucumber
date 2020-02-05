package CucumberGuru;		

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;	
//import StepDefinition.Steps;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Feature",glue={"src\\test\\java\\StepDefinition\\"})						
public class Runner 				
{		

}