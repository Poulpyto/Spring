package com.huios.DemoSpring1;

public class SocieteDevLogiciel {

	private Developpeur dev;
	private Developpeur	chef;
	
	public Developpeur getDev() {
		return dev;
	}
	public void setDev(Developpeur dev) {
		this.dev = dev;
	}
	public Developpeur getChef() {
		return chef;
	}
	public void setChef(Developpeur chef) {
		this.chef = chef;
	}
	@Override
	public String toString() {
		return "SocieteDevLogiciel [dev = " + dev + ", chef = " + chef + "]";
	}
	
	
}
