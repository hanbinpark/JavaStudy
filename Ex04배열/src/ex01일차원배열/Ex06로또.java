package ex01일차원배열;

import java.util.Random;

public class Ex06로또 {

	public static void main(String[] args) {

		// 로또번호 출력하는데 단,중복값이 없어야한다!
		// 랜덤한 숫자를 가져오는 기능
		Random random = new Random();
		
		// 로또 번호가 저장될 배열 만들기
		int[] lotto = new int[6];
		System.out.println("==== 로또타임 ====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!");
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(10) + 1;	// 0~9 + 1 : 1 ~ 10
			//System.out.println(lotto[i]);
			
			// 중독되어있는지 확인, 제거
			// 제거 : 다시 랜덤한 숫자를 재할당
			for(int j = 0; j < i; j++) {
				// 자기 자신을 제외한 앞쪽 인덱스값들과 비교
				if(lotto[i] == lotto[j]) {
					// 재입력
					// lotto[i] : 새로 입력되고 있는 값
					// lotto[j] : 이미 앞쪽에 입력되어 있는 값
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
