package testscenarios;
import api.FlightTicketRequest;
import com.mashape.unirest.http.exceptions.UnirestException;
import framework.ConfigReader;
import framework.DriverSetup;
import Model.Root;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.io.IOException;
import java.util.*;
public class FlightAndBusSearchScenarios {
    static WebDriver driver;
    static Properties properties;
    HomePage homePage;
    FlightTicketRequest flightTicketRequest;
    String keyword = "ada";

    @BeforeClass
    public void setup(){
        properties = ConfigReader.initialize_Properties();
        driver = DriverSetup.initialize_Driver("chrome");
        homePage = new HomePage(driver);
        flightTicketRequest = new FlightTicketRequest();

    }

    @Test(priority = 1, enabled = false)
    public void searchForKeyword() throws InterruptedException {

        homePage.searchForFlightTicket(keyword);

    }
    @Test(priority = 2, enabled = false)
    public void checkListForSearch() throws UnirestException, IOException {
        Map<String, Root> flightMap = new HashMap();
        Map<String, Root> flightMapAPi = new HashMap();

        return flightlist.stream()
                .filter(f -> f.getflightList(); i++)
                .flatMap(flightlist -> flightlist.getAirportList().stream())
                .map(Airport::getCity)
                .distinct()
                .collect(Country.toList());

        }
        public static List< String > flightListApi = flightTicketRequest.flightTicketFromList(keyword);
        return flightListApi.stream();
        .filter(f -> f.getflightlistApi(); i++)
            .flatMap(flightlist -> flightlist.getAirportList().stream())
            .map(Airport::getCity)
                .distinct()
                .collect(flightMap.toList());

        }
        Assert.assertEquals(flightMap.get("ADT"),flightMapAPi.get("ADT"));

    }

    @Test
    public void verifySoftAssertion(){
        Assertion assertion = new SoftAssert();
        assertion.assertEquals("a","b");
        System.out.println("bu okunur");
        Assert.assertEquals("a","b");
        System.out.println("bu okunmaz");
    }

}
