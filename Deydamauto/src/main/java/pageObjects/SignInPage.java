package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;


public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator to identify the Signin fields
    private By username = By.id ("username");
    private By password = By.id ("password");
    private By signInButton  = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");

    public void enterUsername(String uName) {

        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword (String pwd) {
        // Find the password and enter the password
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clicksignInButton (){
        //Find the signInButton and click the element
        driver.findElement(signInButton).click ();
        return new DashboardPage (driver);
    }





}
