package ch09.lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
		MyInterface1 o1 = () -> {
			System.out.println("코드 작성");
		};
		
		o1.method1();
	}
}


// 재정의 해야하는 메소드 1개 (추상 메소드 1개)
interface MyInterface1 {
	void method1();
}