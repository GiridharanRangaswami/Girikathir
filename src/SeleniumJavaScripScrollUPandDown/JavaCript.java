package SeleniumJavaScripScrollUPandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCript {
    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Giridharan\\eclipse-workspace\\Selenium JavaScript Executor Scrol Up & Down\\Driver\\chromedriver.exe");
		
		      WebDriver driver = new ChromeDriver();
		    
		           driver.get("https://www.facebook.com/");
		           
		           WebElement user =  driver.findElement(By.id("email"));
		           
		     JavascriptExecutor js = (JavascriptExecutor)driver;
		   
    js.executeScript("arguments[0].setAttribute('value', 'giridharan28it@gmail.com')", user);
		          
		            WebElement hhh = driver.findElement(By.id("pass"));
		          
		 js.executeScript("arguments[0].setAttribute('value','Rama_Network07')", hhh);
		          
		          //get Attribute value Using JavaScript
		          
       Object obj =  js.executeScript("return arguments[0].getAttribute('value')", user);
		         
		             String s = (String)obj;
		             
		             System.out.println(s);
		                   
		          WebElement app = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		                       
		             js.executeScript("arguments[0].click()",app);
		             
	}	               
		          
}
