package simple;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {



	private static final WebElement SearchBar = null;
	private static WebElement buttonsearch;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(10);
		driver.manage().deleteAllCookies();
		
		
         driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		SearchBar.sendKeys("iphone13");
		 driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		buttonsearch.click();
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?keywords=iphone+13&qid=1701078392&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		
		driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-none a-padding-none\"]//input[@id=\"add-to-cart-button\"]"));
		driver.quit();
		
		

	}

}
