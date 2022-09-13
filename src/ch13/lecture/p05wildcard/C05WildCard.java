package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C05WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Number> list2 = new ArrayList<Number>();
		ArrayList<Object> list3 = new ArrayList<Object>();
		
		setItems.(list1);
		setItems.(list2);
		setItems.(list3);
		
	}
	
	public static void setItems(ArrayList<? super Integer> list) {
		list.add(100);
		list.add(200);
		list.add(300);
	}
}
