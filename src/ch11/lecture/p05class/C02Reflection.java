package ch11.lecture.p05class;

import java.lang.reflect.Field;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		
		System.out.println("필드 목록");
		Field[] fields = c.getFields();
		
		for (Field field : fields) {
			System.out.println(field.get());
		}
	}
}
