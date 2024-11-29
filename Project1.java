package Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1 {

	public static void main(String[] args) {
		 // Print "Hello World" to the console
//        System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create a new instance of the Edge driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//		driver.get("https://hachnat.stage-carelogix.de/sing-in");
        driver.get("https://offbd.karukola.com/login");
		
	
			
			WebElement username = driver.findElement(By.id("email"));
			WebElement pass = driver.findElement(By.id("password"));
			WebElement signin = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[3]/div/button"));
			
			username.sendKeys("hajon47730@evasud.com");
			pass.sendKeys("12345");
			
			signin.click();
			 // Wait for redirection after login
	        try {
	            Thread.sleep(10000); // Wait for 10 seconds (adjust as needed)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(60));
	        
	        
	        //redirect to designated page with URL
	        driver.get("https://offbd.karukola.com/dashboard");
	        
	        
	     // Wait for the page to load and the "Next" button to be clickable
//	        WebElement nextButton = letswait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/div/main/div/div/div[2]/div[2]/div/div[1]/div[2]/button/span[2]")));
	        WebElement nextButton = letswait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/nav/ul[2]/li/a/span")));
	        nextButton.click();
	        
			WebElement signout = driver.findElement(By.xpath("/html/body/div/nav/ul[2]/li/div/a[2]"));
			signout.click();
			
//	        firstname.sendKeys("Little");
	        
	}

}

