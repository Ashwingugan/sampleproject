package xpathtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtabletask2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		int a=0;
		List<WebElement> taskrow = driver.findElements(By.xpath("//tbody//tr"));
		     for(int i=0;i<taskrow.size();i++) {
		    	 
		    	 taskrow.get(i);a++;
		    	 
		     }System.out.println("number of row:"+a);
		
	}

}
