package zTry;


import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;
import com.wolvesfield.util.WolvesUtil;

public class Sept8screenshot {

	WolvesUtil wu;
	OurDriver od = OurDriver.getInstance();
	
	@Test
	public void tryScreenShot() {
		od.openBrowserSingleton("chrome");
		wu = new WolvesUtil();
		wu.sleep(2);
		wu.takeScreenshot("sample");
	}
}
