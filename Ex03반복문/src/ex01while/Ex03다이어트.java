package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int nowKg = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalKg = sc.nextInt();
		
		int lostKg = nowKg;
		int i = 1;
		
		while(lostKg >= goalKg) {
			System.out.print(i + "주차 감량 몸무게: ");
			int minus = sc.nextInt();
			lostKg -= minus;
			i++;
		}
		System.out.println(lostKg + "kg 달성!");
		
		sc.close();

	}

}
