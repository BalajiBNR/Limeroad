package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features ="C:\\Users\\karth\\eclipse-workspace\\SepIpt_Lime\\src\\test\\java\\com\\FeatureFile\\Lime.feature",
					glue = "classpath:com.Step",
					monochrome = true,
					dryRun = false,
					strict = true,
					tags = "@SmokeTest",
					plugin = {"pretty",
							  "json:Resources/lime.json",
							  "html:Res/limeroad.html",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					}
                 )



public class Runner_Class extends Base_Class{
	
		@BeforeClass
		public static void browserLaunch() {
			getDriver("chrome");
		}
}
