package com.rim.quiz;

public class God {
	private static final God god = new God();////

	private God() {	}
	
	public void say() {
		System.out.println("Today is Friday");
	}
	
	public static God get() { //생성자가 private이므로 객체를 생성할 수 없다.
		//멤버메서드에 static을 붙여서 객체가 생성되지 않아도 사용이 가능하게 함.
		//메인메서드에서 God g = new God.get(); 하면 이 메서드를 통해서 God객체가 생성된다.
		////God god = new God();
		return god;
	}
	
}
