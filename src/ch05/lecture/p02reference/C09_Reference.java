package ch05.lecture.p02reference;

import java.util.Arrays;

public class C09_Reference {
	public static void main(String[] args) {
		int[][] a = { {5,4}, {100,200}, {9}};
		
		System.out.println(Arrays.deepToString(a));
		int[][] b = a;
		
		System.out.println(Arrays.deepToString(b));
		
		a[0][0] = 55;
		System.out.println(b[0][0]);
		
		
		a[0] = new int[] {7, 5};
		System.out.println(a[0][0]);
		System.out.println(b[0][0]);
 	}
}
