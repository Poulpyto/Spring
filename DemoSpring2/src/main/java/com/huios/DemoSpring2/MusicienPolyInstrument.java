package com.huios.DemoSpring2;

import java.util.Collection;

public class MusicienPolyInstrument implements Performeur {

	public MusicienPolyInstrument() {
		super();
	}
	
	public void performe() throws PerformanceException {
		for(Instrument instrument : instruments) {
		instrument.jouer();
		}
	}
	
	private Collection<Instrument> instruments;
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
		}
}
