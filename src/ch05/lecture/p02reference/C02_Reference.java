package ch05.lecture.p02reference;

public class C02_Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {9, 19, 101};
		
		a[0] = 33;
		
		System.out.println(a[0]);
		
		int[] c = a;
		
		System.out.println(c[0]);
		
		c[2] = 1000;
		
		System.out.println(a[2]);
	}
}
