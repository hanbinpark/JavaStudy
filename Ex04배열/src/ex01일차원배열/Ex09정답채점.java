package ex01일차원배열;

import java.util.Scanner;

public class Ex09정답채점 {

	public static void main(String[] args) {

		// 사용자가 입력한 답이 실제 정답과 맞는지 채점해보자 + 총합
		
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2) 실제 답을 관리하는 배열 만들기 : answer
		//							1 4 3 2 1 
		
		int[] answer = {1, 4, 3, 2, 1};
		System.out.println("==== 채점하기 ====");
		System.out.println("답을 입력하세요");
		
		// 3) 사용자로부터 정답 입력받기
		// + 입력받은 정답을 관리하는 배열 만들기 : input
		int[] input = new int[5];
		int sum = 0;
		
		for(int i = 0; i < input.length; i++) {
			System.out.print((i+1) + "번답 >> ");
			input[i] = sc.nextInt();
		}
		
		System.out.println("정답확인");
		
		// 4) 실제 정답과 사용자가 입력한 정답이 일치하는지 판단
		// + 맞으면 O, 틀리면 X를 출력하기
		// + 단, 정답이 맞으면 20점을 받을 수 있다!
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == input[i]) {
				System.out.print("O ");
				sum+=20;
			}else {
				System.out.print("X ");
			}
		}
		
		System.out.println("총점 : " + sum);
		sc.close();
	}

}
