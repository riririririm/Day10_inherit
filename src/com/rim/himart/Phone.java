package com.rim.himart;

public class Phone extends Standard{

	private int inch;
	private String name;
	
	public Phone() {
		//super();
		this.inch=12;
		this.name="Note8";
		this.setBrand("samsung");
		this.setColor("black");
		this.setPrice(100);
		this.setPoint(10);
	}
	
	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
