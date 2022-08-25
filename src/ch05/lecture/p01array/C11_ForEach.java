package ch05.lecture.p01array;

public class C11_ForEach {
	public static void main(String[] args) {
		// 향상된 for문 (enhanced for, for-each)
		
		int[] a = {5,7,9,11};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 향상된 For
		for (int item : a) {
			System.out.println(item);
		}
	}
}
