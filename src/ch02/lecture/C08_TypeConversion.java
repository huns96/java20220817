package ch02.lecture;

public class C08_TypeConversion {
	public static void main(String[] args) {
		// 타입 변환
		// 작은 타입에서 큰 타입으로는 자동 변환
		// 큰 타입에서 작은 타입으로는 강제 변환(cast 연산, casting)
		
		// 자동 형변환
		int a = 33;
		short b = 55;
		
		a = b; // 자동 형변환
		
		char c = '가';
		
		long d = c;
		
//		short e = c; 
		
		float f = 3.14F;
		double g = f;
		
		// 정수형 -> 실수형
		int h = 999;
		float i = h;
		double j = h;
		long k = 99999L;
		float l = k;
//		boolean m = k;
		
		boolean n = true;
//		int o = n;
		
		// 강제 형변환 (큰타입 -> 작은 타입)
		long q = 999999L;
//		int p = q;  담을 수 있는 값이라도 8byte의 값을 4byte에 담는건 불가능
		int r = (int) q; // 강제 형변환 (cast, casting)
		System.out.println(r);
		
		q = 30_0000_0000L;
		r = (int) q; // 담을 수 없는 값을 변환하면 값을 잃을 수 있다
		
		// 실수 -> 정수 (강제형변환)
		float s = 3.14F;
//		int t = s;
		int u = (int) s;
		System.out.println(u);
		
		double v = 3.14;
		u = (int) v; // 소수점 이하 탈락
		System.out.println(u);
	}
}
