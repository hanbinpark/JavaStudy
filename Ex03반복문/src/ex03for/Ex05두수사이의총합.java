package ex03for;

import java.util.Scanner;

public class Ex05두수사이의총합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		if (num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				sum += i;
			}
		}else {
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
		}
		
		System.out.println("총합: "+ sum);
		
		sc.close();

	}

}
