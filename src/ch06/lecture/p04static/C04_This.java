package ch06.lecture.p04static;

public class C04_This {
	// this : 생성될 인스턴스 참조값
	// this() : 다른 생성자 호출
	
	C04_This() {
}
	
	C04_This(int a) {
		this();
		// field 초기화...
	}
	
	C04_This(String s) {
		this(3);
	}
	
}
