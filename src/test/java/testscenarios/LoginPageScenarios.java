package testscenarios;
import framework.ConfigReader;
import framework.DriverSetup;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageScenarios {

    static WebDriver driver;
    static Properties properties;

    @BeforeClass
    public static void setup(){

    }

    private static StringBuilder output = new StringBuilder("");

    @Test
    public void myATest() {
        output.append("A");
    }

    @Test
    public void myAATest() {
        output.append("AA");
    }

    @Test
    public void myZTest() {
        output.append("Z");
    }

    @Test
    public void myCTest() {
        output.append("C");
    }

    @Test
    public void myBTest() {
        output.append("B");
    }

    @AfterAll
    public static void assertOutput() {
        assertEquals("AAABCZA", output.toString());
    }


}
