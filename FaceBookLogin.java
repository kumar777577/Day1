package week2.day1;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String title=driver.getTitle();
		
		System.err.println("title");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
