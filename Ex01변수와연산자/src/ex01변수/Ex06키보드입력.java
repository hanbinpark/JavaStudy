package ex01변수;

import java.util.Scanner;

public class Ex06키보드입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로부터 입력받을 수 있는 변수 생성 (Scanner)
		// reference 자료형은 new 키워드 넣기
		// import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		// 스캐너를 통해 정수를 입력받는 방법
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		System.out.println("입력한 숫자는 -> "+ num );
		
		sc.close();
		
	}

}
