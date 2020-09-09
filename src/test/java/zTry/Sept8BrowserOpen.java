package zTry;

import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;

public class Sept8BrowserOpen {

	@Test
	public void openSingleton() {
		OurDriver od = OurDriver.getInstance();
		od.openBrowserSingleton("chrome");
	}
	
	@Test
	public void openNS() {
		OurDriver od = OurDriver.getInstance();
		od.openBrowserNS("chrome");
	}
}
