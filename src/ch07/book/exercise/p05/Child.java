package ch07.book.exercise.p05;

public class Child extends Parent {
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name);  //  <-- 문제 해결
//		this.name = name; // <-- 부모클래스의 생성자를 호출하지 않아서 컴파일 에러 발생
		this.studentNo = studentNo;
	}
	
}
