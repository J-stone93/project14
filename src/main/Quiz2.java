package main;

public class Quiz2 {

	public static void main(String[] args) {

		try {
			
			String s = null; // 빈객체는 사용할 수 없어서 에러남
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
