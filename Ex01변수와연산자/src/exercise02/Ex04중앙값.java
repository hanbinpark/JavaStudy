package exercise02;

import java.util.Scanner;

public class Ex04중앙값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int mid;
		if(num1 > num2) {
			if(num2 > num3) {
				mid = num2;
			}
		}
		System.out.println("중간값은 "+mid);
	

	}

}
