package ch04.lecture.p02method;

public class C08_Return {
	public static void main(String[] args) {
		System.out.println(1);
		int r = method1();
		System.out.println(r);
		System.out.println(2);
		
		int s = method1();
		System.out.println(s);
		System.out.println(3);
	}
	
	public static int method1() {
		return 5;
	}
}
