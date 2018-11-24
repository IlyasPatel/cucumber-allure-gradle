package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"})

public class CucumberJvmTest extends AbstractTestNGCucumberTests {


}