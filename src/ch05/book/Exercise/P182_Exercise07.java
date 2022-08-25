package ch05.book.Exercise;

public class P182_Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		//작성위치
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < array.length; j++) {
			if (min > array[j]) {
				min = array[j];
			}
		}
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}
}
