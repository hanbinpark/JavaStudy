package exercise03;

import java.util.Scanner;

public class Ex04알파벳출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		char eng = sc.next().charAt(0);
		
		for(int i = (int)eng ; i >= 97 ; i--) {
			for(int j = 97; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		sc.close();
		
		
	}

}
