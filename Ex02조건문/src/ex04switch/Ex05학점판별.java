package ex04switch;

import java.util.Scanner;

public class Ex05학점판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		switch(totalScore / 10) {
		case 10,9:
			System.out.println("A학점입니다!");
			break;
		case 8:
			System.out.println("B학점입니다!");
			break;
		case 7:
			System.out.println("C학점입니다!");
			break;
		default:
			System.out.println("D학점입니다!");
		}
		
	}

}
