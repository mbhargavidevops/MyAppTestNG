package com.mycompany.app;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AbstractAppTest {
    
    @BeforeSuite 
    void executeBeforeSuite(){
        System.out.println("Print this beofre the execution of the suite");
    }

    @AfterSuite
    void executeAfterSuite(){
        System.out.println("Test execution is completed for the suite");
    }

    @BeforeTest
    void executeBeforeEveryTest(){
        System.out.println("Initializing the parameters required before each test execution");
    }

    @AfterTest
    void executeAfterEveryTest(){
        System.out.println("Check parameters after test execution");
    }

}
