package ch04.lecture;

public class C12_Break {
	public static void main(String[] args) {
		System.out.println(1);
		
		while (true) {
			System.out.println(2);
			if (true) {
				break;
			}
			System.out.println(3);
		}
		
		System.out.println(4);
	}
}
