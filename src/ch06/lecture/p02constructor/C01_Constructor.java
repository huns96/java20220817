package ch06.lecture.p02constructor;

public class C01_Constructor {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.name = "maverick";
		
		MyClass1 o2 = new MyClass1();
		o2.name = "hangman";
		
		MyClass1 o3 = new MyClass1();
		o3. name = "bob";
		
		MyClass1 o4 = new MyClass1("Phoenix");
		System.out.println(o4.name);
		
		MyClass1 o5 = new MyClass1("goose");
		System.out.println(o5.name);
	}
}
