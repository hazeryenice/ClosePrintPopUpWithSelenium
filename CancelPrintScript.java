

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
	
	Runtime.getRuntime().exec("ENTER FILE LOCATION HERE" + "\\CancelPrintScript.exe");	
	sleep(3);
	
	}
	
}
