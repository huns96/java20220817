package ch04.book;

public class P121_ForPrintFromTo10 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("1~5");
		for(int j = 1; j <= 5; j++) {
			System.out.println(j);
		}
		
		System.out.println("5~10");
		for(int k = 5; k <= 10; k++) {
			System.out.println(k);
		}
		
		System.out.println("5~1");
		for(int l = 5; l >= 1; l--) {
			System.out.println(l);
		}
		
		System.out.println("10~5");
		for(int m = 10; m >= 5; m--) {
			System.out.println(m);
		}
	}
}
