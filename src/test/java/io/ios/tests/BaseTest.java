package io.ios.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.drivers.AndroidDriverManager.quitSession;
import static io.drivers.IOSDriverManager.createIOSDriver;

/**
 * @author Faisal Khatri
 * @since 04/14/2023
 **/
public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void testSetup() {
        createIOSDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        quitSession();
    }

}
