package com.huios.DemoSpring2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("maGuitare")
//@Service("guitare")
public class Guitare implements Instrument {

	public void jouer() {
		System.out.println("GUIT GUITARE...");
	}

}
