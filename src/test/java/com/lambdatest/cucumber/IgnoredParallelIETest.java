package com.lambdatest.cucumber;

import com.lambdatest.LambdaTestSerenityTest;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/TestScenario2And3.feature")
public class IgnoredParallelIETest extends LambdaTestSerenityTest {
}
