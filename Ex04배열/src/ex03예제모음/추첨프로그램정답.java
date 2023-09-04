package ex03예제모음;

import java.util.Random;
import java.util.Scanner;

public class 추첨프로그램정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// 1. 추첨인원 수를 입력받아 이름을 저장하는 배열을 선언
		while (true) {
			int menuNum=0;
			while(menuNum < 3) {//입력받는 추첨메뉴는 3개 이상이므로, 3개 이상일 경우에만 다음 코드로 넘어가도록 만들기.
				System.out.print("추첨메뉴 : ");
				menuNum = sc.nextInt(); 
			}

			String[] names = new String[menuNum];

			for (int i = 0; i < menuNum; i++) {
				System.out.print(i+1 + "번 메뉴이름 입력 : ");
				names[i] = sc.next();
			}
		//===============================================================	
			// 2. 추첨 시작할지 유무를 확인해 Y이면 추첨시작 N이면 프로그램종료
			System.out.println("메뉴이름입력 완료");
			System.out.print("추첨시작 (Y/N)");
			String yn = sc.next();

			if (yn.equals("N") || yn.equals("n")) {
				System.out.println("종료");
				break;
			} else if (yn.equals("Y") || yn.equals("y")) {
				//========================================================
				// 3. Random수를 3개 뽑아 1,2,3등을 지정할 names용 index 뽑기 - 중복을 제외하기
				//int[] rdNums = new int[3]; // 3-1. 3등까지의 index번호를 넣을 배열이므로, 3칸짜리 배열 생성
				int[] rdNums = {menuNum,menuNum,menuNum}; //만약 추첨메뉴 수가 3일 경우,{3,3,3}이 입력됨./추첨인원 수가 3이라는 것은 중복체크할 때 0,1,2 세가지를 보게 될 것이므로 초기값으로 menuNum을 입력하는 것이 알맞다.
				int cnt = 0; // 중복 없이 배열에 입력된 횟수
				// Random수를 배열에 넣기(중복없이)

				while (cnt < 3) {// 중복이 없이 배열에 입력이 3번되면 중복체크 종료.
					int rdNum = rd.nextInt(menuNum); // 랜덤한 수 생성. 사용자가 입력한 수 까지.
					// 3-1. 배열에 rdNum과 중복되는 data가 있는지 찾기.
					boolean dup = false;// 중복을 확인할 변수 dup
					for (int i = 0; i < 3; i++) { // 중복이 있으면 dup를 true로 바꾸고 for문을 빠져나가기.
						if (rdNums[i] == rdNum) { // 문제가 있음. => 배열의 초기값은 0이므로 랜덤으로 들어갈때, 0번 인덱스가 언제나 마지막이 되어버림. => 배열의 초기값을 지정해주자. 몇으로? 전부 추첨수보다 큰 수로!
							dup = true;
							break;
						}
					}

					if (!dup) { // 중복이 없으면, cnt번 index에 랜덤을 넣고 cnt를 1더함
						// rdNums[cnt++] = rdNum;
						rdNums[cnt] = rdNum;
						cnt++;
					}
				}
				//=============================================================
				//4. names에서 1등 2등 3등 꺼내기. 
				for(int i =0; i < rdNums.length; i++) { //rdNums에는 names에 사용할 index 번호가 들어있음.
					System.out.println(i+1+"등 "+names[rdNums[i]]);
				}
				//===============================================================
				//5. 다시 할지 사용자에게 물어보기.
				System.out.print("다시 하시겠습니까? (시작=1 / 종료=0) : ");
				int onOff = sc.nextInt();
				if(onOff==0) {
					System.out.println("종료");
					break;
				}
				
			} else {
				System.out.println("잘못된 입력");
			}

		}

	}

}
