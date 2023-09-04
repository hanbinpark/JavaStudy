package ex02if_else문;

import java.util.Scanner;

public class Ex03입장료계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.println("나이를 말씀해주세요");
		int age = sc.nextInt();
		System.out.println("인원수를 말씀해주세요");
		int people = sc.nextInt();
		int money = 0;
		
		if (age <= 19) {
			money = people * 2500;
		}else {
			money = people * 5000;
		}
		
		System.out.println("총 "+ money + "원 입니다.");
		
		sc.close();
	}

}
