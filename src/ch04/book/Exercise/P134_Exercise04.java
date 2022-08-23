package ch04.book.Exercise;

public class P134_Exercise04 {
	public static void main(String[] args) {
		int num1, num2;
		do {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			
		} while((num1 + num2) != 5);
	 }
}
