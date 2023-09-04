package ex02if_else문;

import java.util.Scanner;

public class Ex04마트계산대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요");
		int cnt = sc.nextInt();
		int money;
		if (cnt >= 11) {
			money = cnt * 9000;
		}else {
			money = cnt * 10000;
		}
		
		System.out.println("가격은 " + money + "원 입니다");
		
		sc.close();
	}

}
