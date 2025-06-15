package automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfosysRound1WebTableHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		int rowSize = rows.size();
		
		for(int i=1; i<=rowSize-1;i++) {
			String[] strArr= {} ; 
			List<WebElement> cells = driver.findElements(By.xpath("//table[@id='countries']//tr["+i+"]/td"));
			if(cells.size() >=4) {
				String country = cells.get(1).getText();
				
				String language = cells.get(4).getText(); 
				strArr =  language.split(";");
				
				
				if(strArr.length >1) {
					System.out.println(country + "- "+Arrays.toString(strArr));
					
				}
				
				
			}
			
		}
		driver.quit(); 
	}

}
