package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bigbasket.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//div[@class='grid place-content-start grid-flow-col gap-x-6']//input"));
		searchBar.click();
		Thread.sleep(2000);
		
		searchBar.sendKeys("Apple",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement priceApple = driver.findElement(By.xpath("//h3[text()='Apple - Royal Gala, Regular']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
		String priceValue = priceApple.getText();
		System.out.println(priceValue);
		
		
		
	}
}
