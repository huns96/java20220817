package ch07.book.s0703;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNO) {
		super(name, ssn);
		this.studentNo = studentNO;
	}
}
