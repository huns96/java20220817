package ch10.lecture.p02try;

public class C07Catch {
	public static void main(String[] args) {
		//catch 블럭은 순서가 상관 있음
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
			
		// 여러 catch 블럭 작성시
		// 상위 타입을 catch블럭 
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("wrong index!!!");
		} catch (Exception a) {
			System.out.println("wrong format@@@@");
		}
	}
}
