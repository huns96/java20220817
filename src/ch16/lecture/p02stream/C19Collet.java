package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C19Collet {
	public static void main(String[] args) {
		IntStream.of(10, 9, 1, 20, 100, 50)
		.boxed()
		.collect(Collectors.averagingDouble(Double::valueOf));
		
		System.out.println(avg1);
		
		long count1 = IntStream.of(10, 9, 1, 20, 100, 50)
				.filter(C19Collet::even)
				.boxed()
				.count();
		
		
		
		
		System.out.println(count2);
				
	}
}
