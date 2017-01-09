package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

/**
 * Created by tom.ben-simhon on 12/27/2016.
 */
public class LoginTest extends tests.TestBase {
    //Class private members
    private static final String VALID_USER = "company";
    private static final String VALID_PASSWORD = "company";
    private static final String INVALID_PASSWORD = "invalid";
    private static final String INVALID_USER = "invalid";

    private LoginPage loginPage = null;
    @Before
    public void setUpLoginTests() {
        loginPage = new LoginPage(driver);
    }
    @Test
    public void testLoginWithValidCreds()
    {
        loginPage.login(VALID_USER,VALID_PASSWORD);
    }
    @Test
    public void testFailToLoginWithInvalidCreds()
    {
        loginPage.login(INVALID_USER,INVALID_PASSWORD);
    }
    @After
    public void tearDownLoginTests()
    {
        driver.quit();
    }
}
