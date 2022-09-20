package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[] arr1 = {"ironman", "cap", "widow", "hulk", "panther"};
		
		System.out.println(Arrays.toString(arr1));
		

//		Arrays.sort(arr1, (a, b) -> a.compareTo(b));
		
		Arrays.sort(arr1, String::compareTo);
		
		System.out.println(Arrays.toString(arr1));
	}
}
