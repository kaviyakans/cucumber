package com.definiation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\definiation\\AddTraiffOutline.java",glue="com.definiation",plugin="html:target")
public class TestRunner {

}
