package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		Object obj = new Integer(0);
		
		try {
			
			String str = (String) obj; // 형변환을 잘못해서 에러남
			
		} catch (ClassCastException e) {
			
			System.out.println(e);
		}

		System.out.println("프로그램이 정상 종료됩니다.");
		
	}

}
