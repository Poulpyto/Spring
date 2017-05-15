package com.huios.DemoSpring2;

import org.springframework.stereotype.Component;

@Component()
public class Piano implements Instrument {

	public void jouer() {
		System.out.println("PIA PIA PIANO...");
	}

}
