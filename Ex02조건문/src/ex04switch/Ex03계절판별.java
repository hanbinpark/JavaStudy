package ex04switch;

import java.util.Scanner;

public class Ex03계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 12:
		case 2:
		case 1:
			System.out.println(num + "은 겨울입니다!");
			break;
		case 3,4,5:
			System.out.println(num + "은 봄입니다!");
			break;
		//case 6,7,8 -> System.out.println(num + "은 여름입니다!");
		
		case 9:
		case 10:
		case 11:
			System.out.println(num + "은 가을입니다!");
			break;
		}
		
//		switch(num / 3) {
//		case 0:
//			System.out.println(num + "은 겨울입니다!");
//			break;
//		case 1:
//			System.out.println(num + "은 봄입니다!");
//			break;
//		case 2:
//			System.out.println(num + "은 여름입니다!");
//			break;
//		case 3:
//			System.out.println(num + "은 가을입니다!");
//			break;
//		default:
//			System.out.println("겨울");
//		}
		sc.close();
		
	}

}
