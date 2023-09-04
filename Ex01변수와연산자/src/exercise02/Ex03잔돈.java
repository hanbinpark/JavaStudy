package exercise02;

import java.util.Scanner;

public class Ex03잔돈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>> ");
		int money = sc.nextInt();
		int fivem = money / 50000;
		int onem = money % 50000 / 10000;
		int onet = money % 50000 % 10000 / 1000;
		int oneh = money % 50000 % 10000 % 1000 / 100;
		int fifty = money % 50000 % 10000 % 1000 % 100 / 50;
		int ten = money % 50000 % 10000 % 1000 % 100 % 50 / 10;
		int one = money % 50000 % 10000 % 1000 % 100 % 50 % 10;
		System.out.println("오만원권 " + fivem);
		System.out.println("만원권 " + onem);
		System.out.println("천원권 " + onet);
		System.out.println("백원 " + oneh);
		System.out.println("오십원 " + fifty);
		System.out.println("십원 " + ten);
		System.out.println("일원 " + one);
		
		sc.close();
		

	}

}
