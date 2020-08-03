package iFrameExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class IframeTest {
	WebDriver driver;
  @Test
  public void sample() {
	  int size=driver.findElements(By.tagName("iframe")).size();
	  System.out.println("iframe found size"+size);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("html[1]/body[1]")).click();
	  System.out.println("iframe found");
	  driver.switchTo().parentFrame();
	  System.out.println("switching successful");
	  driver.switchTo().frame("a077aa5e");
	  driver.findElement(By.xpath("html/body/a/img")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver latest\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
