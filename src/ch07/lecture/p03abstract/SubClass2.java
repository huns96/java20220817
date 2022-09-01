package ch07.lecture.p03abstract;

public class SubClass2 extends SuperClass2 {

	public void cry() {
		System.out.println("왈왈");
	}
	
	@Override
	public void eat() {
		System.out.println("사료를 먹습니다.");
	}
}
