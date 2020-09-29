package training;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgSample {
	private WebDriver driver;

	@BeforeClass
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\setups\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
	    driver = new ChromeDriver(co);
	}

	//@Test
	public void validate() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo();
	    driver.switchTo().window(tabs.get(tabs.size()-1));
		driver.findElement(By.id("identifierId")).sendKeys("ub.aravind");
//		/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button
	//	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
	//	Thread.sleep(5000);
	//	if(driver.getPageSource().contains("Forgot password?")) {
	//		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ak!@120587");
			AssertJUnit.assertTrue(true);
	//	} else {
	//		AssertJUnit.assertFalse(true);
	//	}
	}

	@Test
	public void addtest() {
		JenkinsCalculator a = new JenkinsCalculator();
		System.err.println("SonarQube Checkssssssssssssss");
		AssertJUnit.assertEquals(10, a.addVals(4,6));
//		fail("Not yet implemented");
	}

	@Test
	public void multiplytest() {
		JenkinsCalculator a = new JenkinsCalculator();
		AssertJUnit.assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}

	@Test
	public void checktest() {
		JenkinsCalculator a = new JenkinsCalculator();
		AssertJUnit.assertTrue("Error in Test Report", 24 == a.multiplyVals(4,6));
		AssertJUnit.assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}

	@AfterClass
	public void afterTest() {
//		driver.quit();
	}
}
