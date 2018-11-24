import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"})

public class CucumberJvmTest extends AbstractTestNGCucumberTests {


}