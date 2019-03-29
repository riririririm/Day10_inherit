package com.rim.zoo;

public abstract class Tazo extends Birds {

	private int egg;
	
	public Tazo() {
		super(); //부모의 생성자 호출
	}
	
	public Tazo(int egg) {
		this.egg  = egg;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		eat();
	}

}
