package ex02연산자;

import java.util.Scanner;

public class Ex11삼항연산자빼기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		
		System.out.println("두 수의 차 : "+ result);

	}

}
