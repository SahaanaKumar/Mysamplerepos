package cucumber1package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\A08019DIRP_C2B.02.14\\workspace\\workspace\\cucumber1\\src\\resource\\java\\cucumberfile2.feature",
plugin= {"html:target/report"})

public class Testrunner2 {

  }
