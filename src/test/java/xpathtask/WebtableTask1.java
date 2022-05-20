package xpathtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTask1 {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		int a=0;
		List<WebElement> columntask = driver.findElements(By.xpath("//tbody//th"));
		for(int i=0;i<columntask.size();i++) {
			columntask.get(i);a++;
			
			System.out.println("number of coloumn is:"+a);
		}
		
	}
	

}
