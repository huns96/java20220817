package ch05.lecture.p01array;

public class C01_Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]
		int[] arr1; // arr1 배열이 저장하는 값의 타입은 int
		double[] arr2; // arr2 배열이 저장하는 값의 타입은 double
		String[] arr3; // arr3 배열이 저장하는 값의 타입은 String
		
//		int arr4[];
//		double arr5[];
//		String arr6[];      가능은 하지만 잘 사용되지 않는다
		
		int[] arr4;
		arr4 = new int[5]; // int 값 5개 저장할 공간 생성
		
		arr4[0] = 10; // index 활용해서 값 저장
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200; // 5번 인덱스는 없음
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		int a = arr4[4];
		
		System.out.println(a);
		
	}
}
