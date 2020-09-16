package zTry;

import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;
import com.wolvesfield.util.WolvesUtil;

public class Sept9ElementUtil {

	WolvesUtil wu;
	OurDriver od;
	@Test
	public void tryUtil() {
	od = OurDriver.getInstance();
	od.openBrowserSingleton("chrome");
	wu = new WolvesUtil();
	wu.navigateTo("https://www.google.com/");
}
}
