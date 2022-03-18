package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDroppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
Actions build=new Actions(driver);
//Point location = drag.getLocation();
//System.out.println(location);
build.dragAndDropBy(drag,115,55).perform();
	}

}
