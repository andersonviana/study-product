package com.product.product.java.configuration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:src/test/resources/report/cucumber.json"},
        glue = {"StepDef"},
        features = {"src/test/resources/features"},
        tags = "")
public class CucumberTests {

}
