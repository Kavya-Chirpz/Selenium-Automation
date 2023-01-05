package Actions;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageActions {
	

	WebDriver driver ;

	public void LaunchDriver() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		Thread.sleep(2000);
	driver.manage().window().maximize();	
	
	}

public void LaunchGuru99() throws InterruptedException {
	
		
driver.get("https://demo.guru99.com/test/newtours/index.php");
String title =driver.getTitle();
System.out.println(title);
}


public void LaunchFlipkart() throws Exception {
	
	
driver.get("https://www.flipkart.com/");
String title =driver.getTitle();
System.out.println(title);
this.takeSnapShot(driver, "Login Page") ; 
JavascriptExecutor j = (JavascriptExecutor)driver;
if (j.executeScript("return document.readyState").toString().equals("complete")){
   System.out.println("Page has loaded");
}


}


public void Login_Childwindow() throws Exception {
	
	
	System.out.println("Login Page Is Visble");
	WebElement btn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btn.click();
	Thread.sleep(500);
	this.takeSnapShot(driver, "Home Page") ;
	System.out.println("Login Pop Up Closed");
	

    }

public void search_smartphone() throws Exception {
	System.out.println("Search Bar is Visible");
	WebElement Search;
	WebDriverWait wait=new WebDriverWait(driver, 20);
	Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_3704LK']")));
	//driver.findElement();
	Search.click();
	Search.sendKeys("SmartPhones");
	//this.takeSnapShot(driver, "Search Text");
	Search.sendKeys(Keys.ENTER);
	this.takeSnapShot(driver, "Search Text");
	driver.close();
	
}

public static void takeSnapShot(WebDriver webdriver ,String Imagename) throws Exception{
	SimpleDateFormat Datim = new SimpleDateFormat("ddMMyyyy_hhmmss");
	Date date = new Date();
	String Strda=Datim.format(date);
	String Filepath = "C:\\Users\\HP\\Selenium_SS\\" + Imagename + "_" + Strda +".png";
	

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(Filepath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

}


public void login_page() {
	System.out.println("Page launched");

	
}

}


