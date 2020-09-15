package zTry;


import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;
import com.wolvesfield.util.WolvesUtil;

public class Sept8screenshot {

	WolvesUtil wu = new WolvesUtil();
	OurDriver od = OurDriver.getInstance();
	
	@Test
	public void tryScreenShot() {
		od.openBrowserSingleton("chrome");
		wu.sleep(2);
		wu.takeScreenshot("sample");
	}
}
