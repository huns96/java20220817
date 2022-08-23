package ch04.lecture.p02method;

public class C12_Overloading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a); // 2.5
		
		int b = half(5);
		System.out.println(b); // 2
		// 첫번째 Method가 double half(int v)이면 double b가 와야
		// 오류없이 실행되고 double 타입이기 때문에 값은 2.0이 된다
	}
	
	public static int half(int v) {
		return v / 2;
	}
	
	public static double half(double v) {
		return v / 2;
	}
}
