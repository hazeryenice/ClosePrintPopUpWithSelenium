

package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class CancelPrintScript extends PageBase {
	   public CancelPrintScript(WebDriver driver) {
	        super(driver);
	    }

	public static void cancelPrint() throws IOException {
	//jenkins'te çalisirsa alttaki susturulacak
	//Runtime.getRuntime().exec("C:\\Users\\Gun\\Desktop\\CancelPrintScript.exe");
	Runtime.getRuntime().exec("C:\\Users\\guncetest.otomasyon\\Desktop\\CancelPrintScript.exe");	
	sleep(3);
	//driver.close();
	}
	
}
