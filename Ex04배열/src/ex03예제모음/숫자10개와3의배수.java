package ex03예제모음;

import java.util.Scanner;

public class 숫자10개와3의배수 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<numbers.length;i++) {
			System.out.print(i+1+"번 째 정수 입력>>");
			numbers[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for(int i=0; i<numbers.length;i++) {
			int number = numbers[i];
			if(number%3==0) {
				System.out.print(number+" ");
			}
		}

	}

}
