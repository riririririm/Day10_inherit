package com.rim.himart;

public abstract class Standard {

	private String brand;
	private String color;
	private int price;
	private int point;
	
	public Standard() {
		this.brand="samsung";
		this.color="white";
		this.price=100000;
		this.point=10;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

}
