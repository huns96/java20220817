package ch08.book.P381_382;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface - method2 실행");
	}
}
