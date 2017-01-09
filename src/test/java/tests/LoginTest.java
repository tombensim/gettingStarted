package tests;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
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
    @BeforeAll
    public void setUpLoginTests() {
        loginPage = new LoginPage(driver);
    }
    @Test
    @DisplayName("Login To EriBank with valid Credentials")
    public void testLoginWithValidCreds()
    {
        loginPage.login(VALID_USER,VALID_PASSWORD);
    }
    @Test
    @DisplayName("Fail to Login To EriBank with invalid Credentials")
    public void testFailToLoginWithInvalidCreds()
    {
        loginPage.login(INVALID_USER,INVALID_PASSWORD);
    }
    @AfterAll
    public void tearDownLoginTests()
    {
        driver.quit();
    }
}
