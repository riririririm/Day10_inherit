package com.rim.himart;

public class Tv extends Standard{
	private int inch;
	
	public Tv() {
		//super();
		this.inch = 60;
		this.setBrand("LG");
		this.setColor("white");
		this.setPrice(300);
		this.setPoint(30);
	}
	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

}
