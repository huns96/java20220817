package ch16.book.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expresstions",
				"Java8 supports lambda expresstions"
				);
		
		list.stream()
		.filter(s -> s.toUpperCase().contains("java".toUpperCase()))
		.forEach(a -> System.out.println(a));
				
	}
}
