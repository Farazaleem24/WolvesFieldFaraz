package zTry;

import org.testng.annotations.Test;

import com.wolvesfield.hooks.SetupAndTearDown;
import com.wolvesfield.main.ObjectFactory;

public class SetupTestSept15 extends SetupAndTearDown {

	ObjectFactory of = new ObjectFactory();
	
	@Test
	public void clicking() {
		of.getWu().clickElement("//button[@class='theme-bg']//i[@class='ion-arrow-right-c']");
	}
}
