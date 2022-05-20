package xpathtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
	WebDriver driver ;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createnewacc = driver.findElement(By.xpath("//input[@data-testid='royal_email']//parent::div//following-sibling::div//child::input//parent::div//following::button//following::a[1]//following::a[1]"));
		createnewacc.click();
	}

}
