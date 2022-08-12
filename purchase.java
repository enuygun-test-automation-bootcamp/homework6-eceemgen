package training;
import framework.ConfigReader;
import framework.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;
public class FavoritesTest {

public class purchase {
    static WebDriver driver;
    HomePage homePage;

    String purchaseTitle = "";

    @BeforeClass
    public void setup(){
        driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().get("browser").toString());
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void setPurchaseTitleSuccessfully(){
        Object setPurchaseTitle = homePage.setPurchaseListTitle();
    }


    @Test(priority = 2)
    public void setPurchaseTitle(){
        homePage.checkWishInFavorList(setPurchaseTitle();
    }
}

}
