package ch06.book.s060802;

import ch06.lecture.p03method.MyClass4;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
		}
	}
}
