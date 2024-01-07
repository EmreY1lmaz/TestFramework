package com.TestCompany.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "json:target/cucumber.json",
                    "pretty",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },

            features ="src/test/resources/features",
            glue = "com/TestCompany/step_definitions" ,
            dryRun =true,
            tags ="",
            publish = false

    )

    public class CukesRunner {

}
