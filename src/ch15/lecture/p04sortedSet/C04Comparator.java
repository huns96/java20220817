package ch15.lecture.p04sortedSet;

public class C04Comparator {
	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<>((b1, b2) -> b2.getPrice() - b1.getPrice);
	}
}

