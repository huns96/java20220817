package ch03.lecture.p2binary;

public class C04_StringToNumber {
	public static void main(String[] args) {
		String a = "10";
		int b = 30;
		
		System.out.println(a+b);
		
		int c = Integer.valueOf(a);
		
		System.out.println(c+b);
		
		String d = "3.14";
		double e = 9.8;
		System.out.println(d+e);
		
		double f = Double.valueOf(d);
		System.out.println(f+e);
		System.out.println(Double.valueOf(d) + e);
		
		String g = "Infinity";
		System.out.println(g+e);
		
		System.out.println(Double.valueOf(g) + e);
		
		String h = "NaN";
		System.out.println(Double.valueOf(h) + e);
		
		// 기본타입과 매치되는 참조타입
		// int : Integer
		// long : Long
		// float : Float
		// double : Double
		// char : Character
		// boolean : Boolean
	}
}
