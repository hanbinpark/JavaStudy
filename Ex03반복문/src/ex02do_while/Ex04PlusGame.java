package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 난수 생성
		Random rd = new Random();
		
		System.out.println("====Plus Game====");
		
		// 틀렸을 때는 기존 문제를 
		// 성공했을 때는 새로운 문제를 출력
		// 힌트. 계속 같은 문제를 출제
		// 		성공할 때만 새로운 문제 출제
		
		// 첫 게임을 시작할 때는 3개의 목숨이 주어진다
		// 문제의 답을 틀렸을 때는 목숨을 하나씩 차감하며 
		// 클라이언트에게 알려준다
		// 첫번째 문제를 틀렸을 시) 남은 목숨 2개
		// 목숨이 0이 되는 순간 게임은 종료된다
		
		// 정답 맞출때마다 카운트를 한다
		// 마지막 게임 종료시 최종 맞춘 개수를 보여준다
		// 정답횟수 : 00개
		
		
		int num1 = rd.nextInt(10) + 1;		// 0~9 + 1 -> 1~10
		int num2 = rd.nextInt(10) + 1;
		
		int chn = 3;
		int cnt = 0;
		while(chn > 0) {
			
			System.out.print(num1 + "+" + num2 + "=");
			
			int inputNum = sc.nextInt();
			
			// 정답확인
			
			int answer = num1 + num2;
			
			if(inputNum == answer) {
				System.out.println("정답!!");
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				cnt++;
			}else {
				System.out.println("실패..");
				chn--;
				System.out.println("남은 목숨 " + chn + "개");
			}
			
//			if (chn == 0) {
//				break;
//			}
				
//			System.out.print("계속 하시겠습니까? >> ");
//			String yn = sc.next();
//			if (yn.equals("N")) {
//				break;
//			}
			
		}
		System.out.println("게임 종료.");
		System.out.println("정답 횟수: " + cnt + "개");
		sc.close();
		
		
		
		
		

	}

}
