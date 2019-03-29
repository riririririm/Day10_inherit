package com.rim.zoo;

import com.rim.himart.Airplane;

public class Main {

	public static void main(String[] args) {
		Eagle e = new Eagle();
		Animal a = e;
		Birds b = e;
		Flyable f = e;
		
		Airplane air = new Airplane();
		Flyable f2 = air;
		
		

	}

}
