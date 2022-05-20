package xpathtask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtabletask3 {
	WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone12", Keys.ENTER);

		String phonebrand = "iPhone 12";
		String brand = "//div[contains(text(),'" + phonebrand + "')]";
	
		List<WebElement> findElements = driver.findElements(By.xpath(brand));

		List<String> li = new ArrayList<String>();
		
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			li.add(text);

		}
		System.out.println(li);
		String pricedetail = "//div[contains(text(),'" + phonebrand
				+ "')]//parent::div//following-sibling::div[@class='col col-5-12 nlI3QM']//descendant::div[@class='_30jeq3 _1_WHN1']";

		List<Integer> lo = new ArrayList<Integer>();

		List<WebElement> findElements2 = driver.findElements(By.xpath(pricedetail));

		for (int i = 0; i < findElements2.size(); i++) {
			String text = findElements2.get(i).getText();
			String replaceAll = text.replaceAll("₹", "").replaceAll(",", "");
			int parseInt = Integer.parseInt(replaceAll);
			lo.add(parseInt);
		}
		System.out.println(lo);
	}

}
