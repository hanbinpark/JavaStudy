package exercise03;

import java.util.Scanner;

public class Ex03별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
