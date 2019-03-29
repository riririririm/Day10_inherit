package com.rim.himart;

public class Customer {

	private int money;
	private int point;

	public Customer() {
		this.money = 1000;
		this.point = 0;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void buy(Standard s) {
		if (this.money >= s.getPrice()) {
			this.money -= s.getPrice();
			this.point += s.getPoint();
		}
	}

//	public void buy(Tv t) {
//		if (this.money >= t.getPrice()) {
//			this.money -= t.getPrice();
//			this.point += t.getPoint();
//		}
//
//	}
//
//	public void buy(Computer com) {
//		if (this.money >= com.getPrice()) {
//			this.money -= com.getPrice();
//			this.point += com.getPoint();
//		}
//
//	}

}
