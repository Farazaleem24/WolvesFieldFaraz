package zTry;


import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;
import com.wolvesfield.util.WolvesUtilit;

public class Sept8screenshot {

	WolvesUtilit wu;
	OurDriver od = OurDriver.getInstance();
	
	@Test
	public void tryScreenShot() {
		od.openBrowserSingleton("chrome");
		wu = new WolvesUtilit();
		wu.sleep(2);
		wu.takeScreenshot("sample");
	}
}
