package ch05.lecture.p02reference;

public class C06_Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};
		changeItems(a);
	}
	
	public static void changeItems(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {3, 4};
	}
}
