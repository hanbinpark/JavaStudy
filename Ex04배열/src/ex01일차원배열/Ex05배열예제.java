package ex01일차원배열;

import java.util.Scanner;

public class Ex05배열예제 {

	public static void main(String[] args) {
		
		// 1) 입력하는 도구 가져오기
		
		Scanner sc = new Scanner(System.in);
		
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
		// 배열의 이름 : score
		
		int[] score = new int[5];
		
		int max;
		int min;
		int sum = 0;
		double avg ;
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1)+ "번째 입력 >> ");
			score[i] = sc.nextInt();
		}
		
		// 3) 입력된 점수들을 모두 출력하기
		
		System.out.print("입력된 점수 : ");
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		
		// 4) 최고점수, 최저점수 출력하기
		
		// 사용자가 입력한 후에 max, min 초기화가 이루어져야한다.
		
		max = score[0];
		min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			
			// 최고점수
			if (score[i] > max) {
				max = score[i];
			}
			
			// 최저점수
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최고점수 : "+ max);
		System.out.println("최저점수 : "+ min);
		
		// 5) 총합, 평균 출력하기
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ avg);
		
		sc.close();
		
	}

}
