package exercise03;

import java.util.Scanner;

public class Ex06돈환산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		
		for(int i = 0; i < unit.length; i++) {
			money / unit[i];
					
		}
		
		sc.close();

	}

}
