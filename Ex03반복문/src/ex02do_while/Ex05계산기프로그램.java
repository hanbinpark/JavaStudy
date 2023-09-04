package ex02do_while;

import java.util.Scanner;

public class Ex05계산기프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		do {
			System.out.print("첫 번재 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번재 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();
			
			System.out.print("[1]더하기 [2]빼기 >> ");
			int plusM = sc.nextInt();
			
			if (plusM == 1) {
				result = num1 + num2;
				System.out.println("더하기 연산 결과는 "+ result + "입니다.");
			}else {
				result = num1 - num2;
				System.out.println("빼기 연산 결과는 "+ result + "입니다.");
			}
			System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
			String yn = sc.next();
			
			if (yn.equals("N")) 
				break;
		}while(true);
		
		System.out.println("종료되었습니다.");
		
		
		
	}

}
