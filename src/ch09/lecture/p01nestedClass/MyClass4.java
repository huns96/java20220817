package ch09.lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		// lambda expression (14장)
		// 클래스 구현, 메소드 시그니처 생략 가능
		// 추상 메소드가 하나인 경우에만 사용 가능 (->)
		MyInterface4 l = () -> {
			System.out.println("재정의한 메소드");
		};
	}
}



interface MyInterface4 {
	void method4();
	default void method3() {
		
	}
}