
package e.commerce.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/my_carriers.feature", glue = "src.test.java.e.commerce.stepdefinitions")
public class MyCarriers {

}
