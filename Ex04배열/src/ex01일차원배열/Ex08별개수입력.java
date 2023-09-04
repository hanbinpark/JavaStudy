package ex01일차원배열;

import java.util.Scanner;

public class Ex08별개수입력 {

	public static void main(String[] args) {

		// 사용자로부터 별의 개수를 입력받아서 출력하기
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2) 별의 개수를 저장하는 배열 선언
		int[] star = new int[5];
		
		// 3) 사용자로부터 별의 개수를 입력받아 배열에 저장하기
		for(int i = 0; i < star.length; i++) {
			System.out.print((i+1) + "번째 별의 개수를 입력 >> ");
			star[i] = sc.nextInt();
		}
		
		// 4) 배열에 저장되어있는 별의 개수를 꺼내와서 별을 출력하자
		for(int i = 0; i < star.length; i++) {
			System.out.print(star[i] + " : ");
			for(int j = 0; j < star[i]; j++) {
				// star[i] 데이터값만큼 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int n: star) {
//			System.out.print(n + " : ");
//			for(int i = 0; i < n; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		sc.close();
		
		
	}

}
