package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableinAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		System.out.println(frame);
		WebElement resize = driver.findElement(By.id("resizable"));
		Actions build=new Actions(driver);
		Point location=resize.getLocation();
		System.out.println(location);
		int x=location.getX();
		int y=location.getY();
		build.dragAndDropBy(resize, x+20, y+20);
		

	}

}
