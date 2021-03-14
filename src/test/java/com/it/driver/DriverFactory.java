package com.it.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.it.common.Constants.BASE_URL;

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if (driverName != null) {
            if ("fireFox".equals(driverName)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(driverName)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if ("edge".equals(driverName)) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else if ("chrome".equals(driverName)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

           /* } else if ("BrowserStack".equals(driverName)) {

                class JavaSample {
                    public static final String AUTOMATE_USERNAME = "mariiashumilova1";
                    public static final String AUTOMATE_ACCESS_KEY = "psyH1F4tsRPr1FZvsMEe";
                    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
                    public void main(String[] args) throws Exception {
                        DesiredCapabilities caps = new DesiredCapabilities();
                        caps.setCapability("os_version", "Catalina");
                        caps.setCapability("resolution", "1920x1080");
                        caps.setCapability("browser", "Chrome");
                        caps.setCapability("browser_version", "latest-beta");
                        caps.setCapability("os", "OS X");
                        caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
                        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name// CI/CD job or build name
                        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
                        driver.get("https://www.google.com");
                        WebElement element = driver.findElement(By.name("q"));
                        element.sendKeys("BrowserStack");
                        element.submit();
                        // Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
                        WebDriverWait wait = new WebDriverWait(driver, 5);
                        try {
                            wait.until(ExpectedConditions.titleContains("BrowserStack"));
                            markTestStatus("passed","Yaay title contains 'BrowserStack'!",driver);
                        }
                        catch(Exception e) {
                            markTestStatus("failed","Naay title does not contain 'BrowserStack'!",driver);
                        }
                        System.out.println(driver.getTitle());
                        driver.quit();
                    }
                    // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
                    public void markTestStatus(String status, String reason, WebDriver driver) {
                        JavascriptExecutor jse = (JavascriptExecutor)driver;
                        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
                    }
                }*/

            }else{
                    throw new UnsupportedOperationException();
                }

            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.get(BASE_URL);
            return driver;
        }
    }
