package main;

public class Quiz1 {

	public static void main(String[] args) {

		
		try {
			
			int num = 5/0; // 0으로 나눌 수 없어서 에러남
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");

	}

}
