package ch05.book.Exercise;

public class P182_Exercise7_ForEach {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		//작성위치
		
		for (int arr : array) {
			if (max < arr) {
				max = arr;
			}
		}
		
		
		int min = Integer.MAX_VALUE;
		for (int arr : array) {
			if (min > arr) {
				min = arr;
			}
		}
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}
}
