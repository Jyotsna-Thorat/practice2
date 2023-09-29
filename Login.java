import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.systeminfo.SystemInfo;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws Exception {
	
		//Launch browser
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Mulsan IT//Downloads//SoftwareApplications//chromedriver-win64//chromedriver-win64//chromedriver.exe");
	
		//open URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://ceomadhyapradesh.nic.in/VL.aspx");
		System.out.println("URL open successfully");
	driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement district = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlDist\"]"));
		
		WebElement assembly = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlAC']"));
		
		district.click();
		Select sc1 = new Select(district); 
		sc1.selectByIndex(2);
		Thread.sleep(5000);
		
//		assembly.click();
		
		Select sc2 = new Select(assembly);
		
		List<WebElement> li = sc2.getOptions();
		   int size = li.size();
		//for select district
	for (int i = 0; i < size; i++) { 
		 String options = li.get(i).getText();
		 li.get(i).click();
		 sc2.selectByIndex(i);
         System.out.println(options);
	}
	}

}
