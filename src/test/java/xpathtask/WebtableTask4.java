package xpathtask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.bm.Tetapi;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTask4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung mobiles",Keys.ENTER);
		
		 
		/*
		 * String mobiles = "//div[@class='_4rR01T']"; List<WebElement> samsungmobiles =
		 * driver.findElements(By.xpath(mobiles));
		 * 
		 * List<String> si = new ArrayList<String>();
		 * 
		 * for (int i = 0; i <samsungmobiles.size(); i++) { String text =
		 * samsungmobiles.get(i).getText(); si.add(text);
		 * 
		 * }
		 * 
		 * System.out.println(si);
		 */
		
		String color = "Black";
		String mobile = "//div[contains(text(),'"+color+"')]";
		String price = "//div[contains(text(),'"+color+"')]//parent::div//following-sibling::div[@class='col col-5-12 nlI3QM']//child::div[@class='_30jeq3 _1_WHN1']";
         
		/*
		 * List<WebElement> mobilename = driver.findElements(By.xpath(mobile));
		 * 
		 * for (int i = 0; i < mobilename.size(); i++) {
		 * 
		 * 
		 * 
		 * String text = mobilename.get(i).getText(); System.out.println(text); }
		 */
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(text(),'Black')]//parent::div//following-sibling::div[@class='col col-5-12 nlI3QM']//child::div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < findElements.size(); i++) {
			System.out.println(findElements.get(i).getText());
		}
	
		
		
		
		
		
	}

}
