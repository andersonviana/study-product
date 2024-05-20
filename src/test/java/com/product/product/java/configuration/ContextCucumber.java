package com.product.product.java.configuration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ContextCucumber.class)
@ComponentScan(basePackages = "StepDef")
public class ContextCucumber {
    
}
