package ch04.lecture.p01control;

public class C04_Random {
	public static void main(String[] args) {
		// math.random() : 0이상 1미만의 double 값을 리턴
		double d = Math.random();
		System.out.println(d);
		
		// math.random() * 6 : 0.0이상 6미만 double
		
		// (int) (math.random() * 6  :  0,1,2,3,4,5
		System.out.println((int) d * 6);
		
		// (int) (math.random() * 6 + 1 :  1,2,3,4,5,6
		System.out.println((int) (d * 6) + 1 );
		
		
		// 주사위 (1~6)
		System.out.println("주사위 던지기");
		System.out.println((int) (Math.random() * 6) + 1);
	}
}
