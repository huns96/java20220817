package ch05.lecture.p01array;

import java.util.Arrays;

public class C10_Compare {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b);
		
		int[] c = new int[]{3,4,5};
		int[] d = new int[]{3,4,5};
		
		System.out.println(c == d);
		System.out.println(Arrays.equals(c, d));
		
		
		int[] e = c;
		e[0] = 33;
		System.out.println(c[0]);
		
		System.out.println(e == c);
		
		System.out.println(Arrays.equals(c, d));
	}
}
