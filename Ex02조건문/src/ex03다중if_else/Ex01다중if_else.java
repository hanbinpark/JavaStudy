package ex03다중if_else;

public class Ex01다중if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myMoney = 1500;
		
		if(myMoney >= 5000) {
			System.out.println("생과일 수박주스");
		}else if(myMoney >= 4000) {
			System.out.println("블루레몬에이드");
		}else if(myMoney >= 3000) {
			System.out.println("아이스아메리카노");
		}else if(myMoney >= 2000) {
			System.out.println("얼음물");
		}else {
			System.out.println("드릴 수 있는게 없습니다.");
		}

	}

}
