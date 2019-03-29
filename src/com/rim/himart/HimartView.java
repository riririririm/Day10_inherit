package com.rim.himart;

public class HimartView {
	
	public void view(Standard s) {
		System.out.println("브랜드:" +s.getBrand()); 
		System.out.println("색상:" + s.getColor()); 
		System.out.println("가격:" +s.getPrice()); 
		System.out.println("포인트:" + s.getPoint());
		
		if(s instanceof Tv) {
			Tv t = (Tv)s;
			System.out.println(t.getInch());
		}else if(s instanceof Computer) {
			Computer c = (Computer)s;
		}else {
			Phone p = (Phone)s;
		}
	}

	/*
	 * public void view(Phone p) { System.out.println("[phone]");
	 * System.out.println("인치:" + p.getInch()); System.out.println("브랜드:" +
	 * p.getBrand()); System.out.println("기종명:" + p.getName());
	 * System.out.println("색상:" + p.getColor()); System.out.println("가격:" +
	 * p.getPrice()); System.out.println("포인트:" + p.getPoint());
	 * System.out.println(); }
	 * 
	 * public void view(Computer c) { System.out.println("[computer]");
	 * System.out.println("용량:" + c.getVol()); System.out.println("브랜드:" +
	 * c.getBrand()); System.out.println("cpu:" + c.getCpu());
	 * System.out.println("색상:" + c.getColor()); System.out.println("가격:" +
	 * c.getPrice()); System.out.println("포인트:" + c.getPoint());
	 * System.out.println(); }
	 * 
	 * public void view(Tv t) { System.out.println("[tv]"); System.out.println("인치:"
	 * + t.getInch()); System.out.println("브랜드:" + t.getBrand());
	 * System.out.println("색상:" + t.getColor()); System.out.println("가격:" +
	 * t.getPrice()); System.out.println("포인트:" + t.getPoint());
	 * System.out.println(); }
	 * 
	 * public void view(Tv[] tvs) { for (int i = 0; i < tvs.length; i++) {
	 * this.view(tvs[i]); } }
	 */
	public void view(Customer c) {
		System.out.println("현재 잔액:"+c.getMoney());
		System.out.println("현재 포인트:"+ c.getPoint());
	}
}
