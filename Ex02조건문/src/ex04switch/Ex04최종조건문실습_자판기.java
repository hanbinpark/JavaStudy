package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습_자판기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자판기 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		
		int menu = sc.nextInt();
		int changeMoney = 0;

		
		
		switch(menu) {
		case 1:
			changeMoney = money - 800;
			break;
		case 2:
			changeMoney = money - 500;
			break;
		case 3:
			changeMoney = money - 1500;
			break;
		default:
			System.out.println("잘못된 메뉴선택");
		}
		
		if (changeMoney < 0) {
			System.out.println("돈이 부족해요");
			System.out.println("잔돈 : "+ money + "원");
		}else {
			System.out.println("잔돈 : "+ changeMoney + "원");
			int oneT = changeMoney / 1000;
			System.out.print("천원 : " + oneT +"개, ");
			int fiveH = changeMoney % 1000 / 500;
			System.out.print("오백원 : " + fiveH +"개, ");
			int oneH = changeMoney % 1000 % 500 / 100;
			System.out.print("백원 : " + oneH +"개");
			
		}
		
		
			
		sc.close();

	}

}
