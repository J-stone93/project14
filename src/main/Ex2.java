package main;

public class Ex2 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
//		arr[5] = 5;
		// java.lang.ArrayIndexOutOfBoundsException 에러의 종류 
		// Index 5 out of bounds for length 5 상세메세지 / 0~4 크기의 배열에 인덱스 5를 써서 런타임 에러남
		// (Ex2.java:9) 에러 위치 링크
		System.out.println("프로그램이 정상 종료됩니다.");

		try {
			arr[5] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
