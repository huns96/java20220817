package ch06.book.s061303.package1;

public class A {
	// 필드
	public int field1;            // <----------------------- public  접근제한
	int field2;                   // <----------------------- default 접근제한
	private int field3;           // <----------------------- private 접근제한
	
	// 생성자
	public A() {
		field1 = 1;     // (o)
		field2 = 1;     // (o)
		field3 = 1;     // (o)
		                    //  클래스 내부일 경우 접근 제한자의 영향을 받지 않는다
		method1();      // (o)
		method2();      // (o)
		method3();      // (o)
	}
	
	// 메소드
	
	public void method1() {}     // <----------------------- public  접근제한
	void method2() {}            // <----------------------- default 접근제한
	private void method3() {}    // <----------------------- private 접근제한
}
