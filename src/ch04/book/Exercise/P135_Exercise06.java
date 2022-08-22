package ch04.book.Exercise;

public class P135_Exercise06 {
	public static void main(String[] args) {
		System.out.println("sysout");
		System.out.println("hello");
		System.out.println("hi");
		System.out.print("엔터없이");
		//(다음줄을 같은줄에 출력)
		System.out.println("정말?");
		System.out.println("또 다음줄");
		System.out.println();
		System.out.println();
		System.out.println("위에 새로운 줄 있니?");
		
		//println은 내용을 출력하고 줄을 바꿈 print는 줄바꿈 X
		
		System.out.println("별표찍기 print, println 으로 분리");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("중첩 for문 사용");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("중첩 for문 사용");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
