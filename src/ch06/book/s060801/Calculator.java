package ch06.book.s060801;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divice(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
}
