package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentSparkReporter reporter=new ExtentSparkReporter("report.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test=extentReports.createTest("Madurai");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		driver.findElement(By.name("q")).sendKeys("Madurai");
		driver.findElement(By.name("q")).submit();
		test.pass("Test passed");
		driver.quit();
		extentReports.flush();
		
		

	}

}
