package ex03예제모음;

import java.util.Random;
import java.util.Scanner;

public class 추첨프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("추첨 메뉴 수 입력 >> ");
		int menuCnt = sc.nextInt();
		int[] numArr = new int[3];
		String[] arr = new String[menuCnt];
		
		for(int i = 0; i < menuCnt; i++) {
			System.out.print("메뉴 입력 >> ");
			String menu = sc.next();
			arr[i] = menu;
		}
		
		while(true) {
			System.out.print("추첨을 시작할까요?(Y/N) >> ");
			String yn = sc.next();
			
			if(yn.equals("Y")) {
				for(int i = 0; i < numArr.length; i++) {
					numArr[i] = random.nextInt(menuCnt);
					for(int j = 0; j < i; j++ ) {
						if(numArr[j] == numArr[i]) {
							i--;
						}
					}
				}
				for(int i = 0; i < numArr.length; i++) {
					
					System.out.println(arr[numArr[i]]);
				}
			}else if(yn.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
		}
	}

}
