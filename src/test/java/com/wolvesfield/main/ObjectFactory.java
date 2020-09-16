package com.wolvesfield.main;

import com.wolvesfield.util.WolvesUtil;

public class ObjectFactory {
	
	OurDriver od;
	WolvesUtil wu;
	
	public OurDriver getOd() {
		od = OurDriver.getInstance();
		return od; 
	}
	
	public WolvesUtil getWu() {
		wu = new WolvesUtil();
		return wu;
	}

}
