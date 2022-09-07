package ch11.lecture.p02wrapper;

public class C02AutoBoxing {
	public static void main(String[] args) {
		int a = 3;
		// 기본타입을 참조타입으로 변경
		Integer b = Integer.valueOf(a);
		
		// 기본타입을 참조타입으로 자동으로 변경
		Integer c = a; // 예전엔 위 코드처럼 수동으로 변경해야했지만 지금은 자동으로 변경된다(AutoBoxing)
		
		Object d = a;
		Object e = 99;
		
		Object[] arr = {"java", 3, true};
		
	}
}
