package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitClass extends BaseClass{
	
	public static void sendKeys(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}
	

	public static  void selectgender(List<WebElement>ls,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		List<WebElement> wb1 = wait.until(ExpectedConditions.visibilityOfAllElements(ls));
		for(WebElement abc:wb1)
		{
			String a = abc.getText();
			if(a.equalsIgnoreCase(value))
			{
				abc.click();
			}
		}
	}

}
