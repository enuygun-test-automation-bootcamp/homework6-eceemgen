package testscenarios;
import framework.DriverSetup;
import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class LoginPageScenariosJupiter {
    @Ignore
    public void m6() {
        System.out.println("Using @Ignore , this execution is ignored");
    }
    private static StringBuilder output = new StringBuilder("");

    @Test
    @Order(3)
    void myATest() {
        output.append("A");
    }

    @Test
    @Order(2)
    void myCTest() {
        output.append("C");
    }

    @Test
    @Order(1)
    void myZTest() {
        output.append("Z");
    }

    @Test
    @Order(1100)
    void myMethodCheck(){

    }

    @AfterAll
    public static void assertOutput() {
        assertEquals("ZCA", output.toString());
    }
}
