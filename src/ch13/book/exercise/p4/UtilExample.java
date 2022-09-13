package ch13.book.exercise.p4;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		childPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
		
		/* OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원, 20);
		int otherAge = Util.getValue(otherPair, "홍삼원");
		System.out.println(otherAge); */
	}
}
