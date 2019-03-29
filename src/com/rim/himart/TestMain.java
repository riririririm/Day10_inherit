package com.rim.himart;

public class TestMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		Phone p = new Phone();
		HimartView hv = new HimartView();
		
//		hv.view(tv);
//		hv.view(p);
//		hv.view(com);
		
		Tv[] tvs = new Tv[3];
		for(int i=0;i<tvs.length;i++) {
			tvs[i] = new Tv();
		}
		hv.view(tvs);
		
		

	}

}
