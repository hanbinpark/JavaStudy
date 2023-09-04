package ex02if_else문;

import java.util.Scanner;

public class Ex02정보처리기사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int cnt1 = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int cnt2 = sc.nextInt();
		
		System.out.print("OS : ");
		int cnt3 = sc.nextInt();
		
		System.out.print("데이터통신 : ");
		int cnt4 = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int cnt5 = sc.nextInt();
		
		boolean isCheck1 = (cnt1 + cnt2 + cnt3 + cnt4+ cnt5) >= 60;
		
		boolean isCheck2 = cnt1 >= 8 && cnt2 >= 8 && cnt3 >= 8 && cnt4 >= 8 && cnt5 >= 8;
		
		if (isCheck1 && isCheck2) {
			System.out.println("합격입니다!");
		}
		else {
			System.out.println("불합격입니다!");
		}
		
//		int total = cnt1 + cnt2 + cnt3 + cnt4 + cnt5;
//		
//		if ( cnt1 < 8 || cnt2 < 8 || cnt3 < 8 || cnt4 < 8 || cnt5 < 8) {
//			
//			System.out.println("불합격입니다!");
//		}
//		else {
//			if (total >= 60)
//				System.out.println("합격입니다!");
//			else
//				System.out.println("불합격입니다!");
//		}
//		
		sc.close();
	}

}
