package webtesting; 
import org.openqa.selenium.*; 
import org.openqa.selenium.chrome.ChromeDriver; 


public class WebTesting { 

static WebDriver driver; 

    public static void main(String[] args) throws InterruptedException { 

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
        driver= new ChromeDriver(); 
        driver.get("https://ecampus.ius.edu.ba/");
        driver.findElement(By.id("edit-name")).sendKeys("ozge");
        driver.findElement(By.id("edit-pass")).sendKeys("letmepass");
        driver.findElement(By.id("edit-submit")).click();

        if(driver.getPageSource().contains("Sorry, unrecognized username or password")){
            System.out.println("Test Case 3: Passed. We cannot get in.");
        }
        else{
            System.out.println("Test Case 3: Failed. We are in.");
        }
        
        Thread.sleep(2000); 
        driver.quit();
    }
} 