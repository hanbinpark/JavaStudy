package ex03예제모음;

import java.util.Random;

public class 배열실습_랜덤정수10개 {

	public static void main(String[] args) {
		//랜덤으로 정수 10개 뽑아서 총합과 평균 출력하기.
		
		//1. 정수 10개가 저장될 배열 생성.
		int[] num = new int[10]; //초기값 0
		Random rd = new Random();
		//2. 데이터셋팅(리소스) / 연산 / 출력
		//랜덤 수 셋팅 => 리소스 구성
		// 0~9번까지 한칸씩 셋팅.
		for(int i=0; i<num.length; i++) {
			//랜덤수 뽑아서 num의 i번째 방에 저장.
			num[i] = rd.nextInt(20);
			//검사용 for문 j
			// 1. j범위 결정하기.
			// 2. j번째 숫자랑 i번째 숫자랑 비교하기
			// 3. 같다면 i강제로 감소시키기
			for(int j = 0; j<i;j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			
		}
		
		// 3, 출력하기
		// 확장for문, for-each문 배열에 특화되어있는 for문
		for(int temp : num) { // num의 모든 값 출
			System.out.println(temp);
		}
		
		// 4. 총합과 평균 구하기
		// 0번~ 9번, 1개씩 
		int sum = 0;
		for(int i =0; i<num.length;i++) {
			sum += num[i];
		}
		System.out.println("총합 : "+sum);
		double avg = sum / (double) num.length;
		System.out.println(avg);
		// 5. 홀수 값 출력하기
	}

}
