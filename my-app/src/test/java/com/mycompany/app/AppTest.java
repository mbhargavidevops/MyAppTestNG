package com.mycompany.app;


import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mycompany.app.App;
/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractAppTest{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        int value = 25;
        assertThat("The test run is ON").isNotNull().startsWith("The").contains("run").containsIgnoringCase("ON");
        assertThat(value).isGreaterThan(20);
        System.out.println("value is " + value);
    }

    @Test
    public void testGreatestOfTwo(){
        App testApp = new App();
        int result = testApp.greatestOfTwo(11,12);
        assertThat(result).isEqualTo(12).isNotEqualTo(0);
        System.out.println("The Greatest Test is passed");
    }

    @Test
    public void TestAddTwoNumbers(){
        App testApp = new App();
        int test = testApp.addTwoNumbers(0, 100);
        assertThat(test).isGreaterThanOrEqualTo(100);

    }
}
