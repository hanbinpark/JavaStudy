package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int cnt = 1;
		
		do {
			System.out.print("숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			
			if (num > 100) {
				break;
			}
			
			sum += num;
			avg =  (double)sum / cnt;
			cnt++;
			
		}while(true) ;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 평균이 소수점 2자리까지만
		
		avg = (int)(avg * 100) / 100.0;
		System.out.println("평균(소수점 2자리) : " + avg);
		
		
		sc.close();

	}

}
