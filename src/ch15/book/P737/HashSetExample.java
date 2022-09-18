package ch15.book.P737;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Sevlet/JSP");
		set.add("java");
		set.add("iBATIS");

		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		System.out.println("Iterator 사용");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("향상된 for문");
		for(String pfor : set) {
			System.out.println("\t" + pfor);
		}
		System.out.println("for Each");
		set.forEach((e) -> System.out.println("\t" + e));
		
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	
	}
}
