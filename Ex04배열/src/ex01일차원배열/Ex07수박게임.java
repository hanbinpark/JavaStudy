package ex01일차원배열;

import java.util.Scanner;

public class Ex07수박게임 {

	public static void main(String[] args) {
		
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2) "수", "박"을 저장할 배열
		String[] arr = {"수","박"};
		
		
		// 수박게임만들기
		System.out.println("==== 수박 게임 Strat! ====");
		
		// 3) 사용자에게 숫자 입력받기
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		// 4) num번 반복 : 글자를 출력하는 것
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i % 2]);
		}
		
		sc.close();

	}

}
