package zTry;

import org.testng.annotations.Test;

import com.wolvesfield.main.OurDriver;
import com.wolvesfield.util.WolvesUtilit;

public class Sept9ElementUtil {

	WolvesUtilit wu;
	OurDriver od;
	@Test
	public void tryUtil() {
	od = OurDriver.getInstance();
	od.openBrowserSingleton("chrome");
	wu = new WolvesUtilit();
	wu.navigateTo("https://www.google.com/");
}
}
