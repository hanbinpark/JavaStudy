package exercise02;

import java.util.Scanner;

public class Ex06369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오 >> ");
		int num = sc.nextInt();
		int cnt = 0;
		if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
			cnt++;
		}
		if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9 ) {
			cnt++;
		}
		
		if (cnt == 1) {
			System.out.println("박수짝");
		}else if(cnt ==2) {
			System.out.println("박수짝짝");
		}else {
			System.out.println(num);
		}
		
	}

}
