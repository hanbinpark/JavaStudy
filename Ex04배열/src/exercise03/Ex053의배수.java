package exercise03;

import java.util.Scanner;

public class Ex053의배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		
		int[] arr = new int[10];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		sc.close();


	}

}
