package com.rim.zoo;

public interface Flyable {

	//상수
	//접근 지정자는  public static final이며 안쓰면 자동생성
	public static final int NUM=10;
	int NUMBER  =20;
	
	//추상메서드
	//public abstract 안쓰면 자동생성
	public abstract void fly();
}
