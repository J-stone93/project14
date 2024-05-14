package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {

	public static void openTextFile() throws FileNotFoundException { 
		//throws를 통해 함수 사용하는 곳에서 예외처리 사용처에서 예외처리가 다를때 사용
		
		FileInputStream fis = new FileInputStream("src/main/a.txt");
		
	}
	
	
	public static void main(String[] args) {

		try {
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
