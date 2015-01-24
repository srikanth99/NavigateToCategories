package com.nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ahmad on 24/01/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format={"html:target/cucumber"}, tags = "@categoriesList")
public class RunTest {

}
