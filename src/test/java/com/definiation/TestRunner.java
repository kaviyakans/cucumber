package com.definiation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sambath\\eclipse-workspace\\cucumber1\\src\\test\\resources\\Feature",glue="com.definiation",plugin= {"html:target","json:src\\test\\resources\\Feature\\report.tex"},tags= {"@smoke"})
public class TestRunner {

}
