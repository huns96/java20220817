package ch04.book.Exercise;

public class P134_Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) {
			if((i%3) == 0) {
				sum += i;
			}
		}
			System.out.println(sum);
		
	}
}
