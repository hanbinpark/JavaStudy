package ex03for;

import java.util.Scanner;

public class Ex04for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력받은 두 수의 사이 값들 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for (int i = num1 > num2 ? num2 : num1; i <=( num1 > num2 ? num1 : num2); i++) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
