package SignIn;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.SignInPage;
import setUp.setUps;

public class SignInTests extends setUps {


    @Test (priority = 1)
    public void testSignIn() throws InterruptedException{
        signInPage.enterUsername("masterT");
        signInPage.enterPassword("admintop34");

        DashboardPage dashboardPage = signInPage.clicksignInButton();
        dashboardPage.clicktopBarUsername();
        signInPage = dashboardPage.clickLogout();

        //Check whether the pageTitle is correct
        String pageTitle = "Deydam";
        if (pageTitle.equalsIgnoreCase("Deydam")){
            System.out.println("The page title is "+ pageTitle);
        } else System.out.println("The page title is incorrect. Actual page title is " + pageTitle);
    }
}
