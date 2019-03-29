package com.rim.himart;

public class TestMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		Phone p = new Phone();
		HimartView hv = new HimartView();
		Customer c = new Customer();
		
//		hv.view(tv);
//		hv.view(p);
//		hv.view(com);
		
		Tv[] tvs = new Tv[2];
		for(int i=0;i<tvs.length;i++) {
			tvs[i] = new Tv();
			//c.buy(tvs[i]);
		}
		//hv.view(tvs);
		c.buy(tv);
		c.buy(com);
		
		hv.view(c);
		
		
		
//		Standard s =tv;
//		((Tv)s).getInch();
//		
//		System.out.println(s.getBrand());
//		System.out.println(s.getPrice());
		
		Standard[] standards = new Standard[3];
		standards[0]=tv;
		standards[1]=com;
		standards[2]=p;
		

	}

}
