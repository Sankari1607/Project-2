package spice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.InvalidSelectorException;


public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.close();
		
		
		
			
		
		//driver.findElement(By.xpath("//select[@class ='form-control form-select']")).click();
		//driver.findElement(By.xpath("//select[@class ='form-control form-select']")).toString();
		//List<String>expectedTitle=Arrays.asList("Mr","MRS","MISS");
		//driver.findElement(By.linkText("LOGIN")).click();*/
		//driver.findElement(By.xpath("))
	}

@Test
	
public void login () throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement element = driver.findElement(By.xpath("//div[text() = 'Login']"));
			element.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el = driver.findElement(By.xpath("//div[text() = 'Email']"));
		el.click();
		//driver.findElement(By.id("spin"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ragnastaffing@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ra123");
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
}
@Test

public void Signuppage() throws InterruptedException{
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='Signup']")).click();
	driver.switchTo().newWindow(WindowType.TAB);
	WebElement dropDown = driver.findElement(By.tagName("//select[@class ='form-control form-select']"));
	
	Select select = new Select(dropDown);
	select.selectByVisibleText("Mr");
	List<WebElement>options = select.getOptions();
	for (WebElement option : options) 
	{
		
		String text = option.getText();
		System.out.println(text);
	}
	driver.findElement(By.xpath("//input[@id = 'first_name']")).sendKeys("san");
	driver.findElement(By.xpath("//input[@id = 'last_name']")).sendKeys("Muthu");
		
		
				
	}



public void closetheweb() throws InterruptedException{
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.quit();
}
public void Bookingpagescheckin() throws InterruptedException{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='check-in']")).click();
	WebElement tktno = driver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']"));
	tktno.sendKeys("W9X987");
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com']"));
	email.sendKeys("ragnastaffing.gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[contains(text(),'Search Booking')]")).click();
}
public void Bookingpagesmanage() throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[contains(text(),'manage booking')]")).click();
	WebElement tktno = driver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']"));
	tktno.sendKeys("W10X568");
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com / Doe']"));
	email.sendKeys("ragnastaffing.gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
}
	
	
}
	
	
}








//ragnasstaffing@gmail.com