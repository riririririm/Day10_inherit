package com.rim.himart;

public class Computer extends Standard{
	private int vol;
	private String cpu;
	
	public Computer() {
		//super();
		this.vol = 500;
		this.cpu = "i7";
		this.setBrand("Apple");
		this.setColor("silver");
		this.setPrice(200);
		this.setPoint(20);
	}
	
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
