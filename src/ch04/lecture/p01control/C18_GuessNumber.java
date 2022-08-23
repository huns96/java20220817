package ch04.lecture.p01control;

import java.util.Scanner;

public class C18_GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터가 1 ~ 100사이의 값을 랜덤하게 뽑고
		// 사용자의 입력값에 따라 맞출때까지 메시지 출력
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random() * 100) + 1;
		System.out.println("랜덤 숫자 맞추기(1 ~ 100)");
		
		while(true) {
		System.out.print("숫자를 입력하세요 : ");
		int user = scanner.nextInt();
		
		if (user == num) {
			System.out.println("정답입니다.");
			break;
		} else if (user > num) {
			System.out.println("더 작은 숫자를 입력하세요");
		} else {
			System.out.println("더 큰 숫자를 입력하세요");
		}
	}
}
}