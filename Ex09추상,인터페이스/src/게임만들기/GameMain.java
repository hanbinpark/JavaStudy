package 게임만들기;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 개발자 1
		PlusGame game = new PlusGame();
		
		int cnt = 3;
		// 개발자 2 완성한 파일 PlusGame 받은 후 GameDummy 객체를 PlusGame 객체로 바꿔주기
		for(int i = 0; i < 5; i++) {
			
			System.out.print(game.getQuizMsg());
			
			int answer = sc.nextInt();
			boolean isCheck = game.checkAnswer(answer);
			
			if(isCheck) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
				cnt--;
				System.out.println("남은 목숨"+cnt);
			}
			
			if(cnt == 0) {
				break;
			}
		}
		
		
		
	}

}
