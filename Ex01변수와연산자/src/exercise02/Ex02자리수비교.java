package exercise02;

import java.util.Scanner;

public class Ex02자리수비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = sc.nextInt();
		
		if (num / 10 == num % 10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		

	}

}
