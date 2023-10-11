package step_definitions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilitiess.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Try_SSOAGAIN {

     /*   String username = "USERNAME"; //Enter your username
        String accesskey = "ACCESSKEY"; //Enter your accesskey

        static RemoteWebDriver driver = null;
        String gridURL = "@hub.lambdatest.com/wd/hub";

        boolean status = false;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser)throws MalformedURLException
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "chrome"); 	//To specify the browser
                capabilities.setCapability("version", "70.0");		//To specify the browser version
                capabilities.setCapability("platform", "win10"); 		// To specify the OS
                capabilities.setCapability("build", "AuthPopUp");               //To identify the test
                capabilities.setCapability("name", "AuthPopUpTest");
                capabilities.setCapability("network", true); 		// To enable network logs
                capabilities.setCapability("visual", true); 			// To enable step by step screenshot
                capabilities.setCapability("video", true);			// To enable video recording
                capabilities.setCapability("console", true); 			// To capture console logs
                try {
                    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
                } catch (MalformedURLException e) {
                    System.out.println("Invalid grid URL");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            else if(browser.equalsIgnoreCase("Firefox"))
            {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "Firefox");	//To specify the browser
                capabilities.setCapability("version", "76.0");		//To specify the browser version
                capabilities.setCapability("platform", "win10"); 		// To specify the OS
                capabilities.setCapability("build", " AuthPopUp");	//To identify the test
                capabilities.setCapability("name", " AuthPopUpTest");
                capabilities.setCapability("network", true); 		// To enable network logs
                capabilities.setCapability("visual", true); 			// To enable step by step screenshot
                capabilities.setCapability("video", true); 		                  // To enable video recording
                capabilities.setCapability("console", true); 			// To capture console logs
                try {
                    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
                } catch (MalformedURLException e) {
                    System.out.println("Invalid grid URL");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }


        @Test
        public void Login() {
            String username = "xt3533";

            String password = "M1k1am0?glc";

           // https://eacs-col.servizi.prv/test
            String URL = "https://xt4052:Prova15@!e@eacs-col.servizi.prv/test/basic_auth";
            Driver.getDriver().get(URL);

            Driver.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            String title = Driver.getDriver().getTitle();

            System.out.println("The page title is "+title);

            String text = Driver.getDriver().findElement(By.tagName("p")).getText();

            System.out.println("The test present in page is ==> "+text);



        }

        @AfterTest
        public void tearDown() {
            Driver.getDriver().quit();
        }



      */


    }

