package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       
        features = "src/test/resources/features",
        glue= {"step_definitions"},
        plugin = {"json:target/cucumber-reports/Cucumber.json",},
       // monochrome = true,
        tags = "@RF51LineeAereeSostegni"
        //publish = true
)

public class TestRunner {

}
/* features = "src/test/resources/features",
        glue= {"step_definitions"},
        plugin = { "html:target/cucumber-report.html",
               "rerun:target/rerun.txt",
                "json:target/cucumber-reports/Cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",},
        monochrome = true,
        tags = "@RF51LineeAereeSostegni",
        publish = true*/