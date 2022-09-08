package ch11.lecture.p05class;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		
		Field[] fields = c.getFields();
		
		for (Field field : fields)
	}
}
