package ch05.lecture.p01array;

public class C05_Length {
	public static void main(String[] args) {
		int[] arr1 = { 100, 200, 300 };

		int[] arr2 = { 9, 8 };

		int[] arr3 = { 2 };

		int[] arr4 = {};

		printLength(arr1);
		printLength(arr2);
		printLength(arr3);
		printLength(arr4);
		printLength(new int[] { 9, 8, 7, 6, 5 });

	}

	public static void printLength(int[] arr) {
		System.out.println(arr.length);

	}
}
