package ex04switch;

import java.util.Scanner;

public class Ex01switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch를 활용한 메뉴 선택
		// 1.햄버거 2.짜장면 3.제육볶음 4.초밥
		Scanner sc = new Scanner(System.in);
		System.out.println("======점심메뉴 추천======");
		System.out.print("1.햄버거 2.짜장면 3.제육볶음 4.초밥 >> ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("동명동 본투비버거");
			break;
		case 2:
			System.out.println("열도지 간짜장");
			break;
		case 3:
			System.out.println("수라간 제육볶음");
			break;
		case 4:
			System.out.println("초밥");
			break;
		default:
			System.out.println("정확한 숫자를 입력해주세요.");
		}
		
		sc.close();

	}

}
