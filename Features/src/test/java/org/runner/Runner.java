package org.runner;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/org/adactin/adactin.feature",glue = "org.step")
public class Runner  extends BaseClass{
	
	
	@BeforeClass
	public static void start() {
		
		browser();
		
	}

	
}
