package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("democsr");
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
				String title = driver.getTitle();
				System.err.println(title);
				
			}

		


	}


