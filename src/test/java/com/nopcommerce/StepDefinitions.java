package com.nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ahmad on 24/01/2015.
 */
public class StepDefinitions {
    public WebDriver driver;

    @Before
    public void startBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        //driver.get("http://srikanthgoudm1-001-site1.smarterasp.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void stopBrowser()
    {
        driver.quit();
    }
    @Given("^user is on teh homepage$")
    public void user_is_on_teh_homepage() throws Throwable {
        Assert.assertTrue(driver.findElement(By.linkText("Log in")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed());
    }

    @Then("^user should see the '(.*)' category on the left panel on the homepage$")
    public void userSeesBooksCategory(String category) throws Throwable {
        Assert.assertTrue(driver.findElement(By.linkText(category)).isDisplayed());
    }

    @When("^user selects category as '(.*)'$")
    public void userSelectsBooks(String category) throws Throwable {
        driver.findElement(By.linkText(category)).click();
    }
    @Then("^user should navigate to the '(.*)' page$")
    public void userVisitsTheBooksPage(String category) throws Throwable {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(category));

    }

    @Then("^user should see the heading as '(.*)'$")
    public void headingBooks(String category) throws Throwable {
        Assert.assertEquals(driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText(),category);
    }


}
