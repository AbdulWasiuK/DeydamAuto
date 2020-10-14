package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }


    //Using By to locate dashboardPage elements
    private By topBarUsername = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button[1]");
    private By logoutButton = By.linkText("Log Out");

    public void clicktopBarUsername () throws InterruptedException {

        //Wait for 10 seconds before executing the action
        Thread.sleep(10000);

        //Find the clicktopBarUsername element and click on the clicktopBarUsername button

        driver.findElement(topBarUsername).click();
    }
    public SignInPage clickLogout() throws InterruptedException {

        //Wait for 10seconds before executing the action
        Thread.sleep(10000);

        //find the logout element and click on the logout button
        driver.findElement (logoutButton).click();
        return new SignInPage(driver);

    }

}
