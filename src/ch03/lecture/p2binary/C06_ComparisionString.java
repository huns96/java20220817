package ch03.lecture.p2binary;

public class C06_ComparisionString {
	public static void main(String[] args) {
		// String 끼리 크기 비교 연산(<, <=, >, >=) 안됨
		String a = "hello";
		String b = "hi";
//		System.out.println(a < b); // x
		
		// String 끼리 같은 지 비교 연산 (==, !=)
		// equals 메소드 쓰기!!!
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // java
		
		System.out.println(c == d);
		System.out.println(c == g);
		
		System.out.println(c.equals(d));
		System.out.println(c.equals(g));
	}
}
