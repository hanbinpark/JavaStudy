package ex03for;

public class Ex06369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 끝자리 수가 3,6,9 일 때 "박수"
		// 끝자리 수가 5일 때 "으악"
		// 그 외의 나머지 수는 그냥 숫자 출력
		
		for(int i = 1; i <= 50; i++) {
			switch(i % 10) {
			case 3,6,9:
				System.out.println("박수");
				break;
			case 5:
				System.out.println("으악");
				break;
			default:
				System.out.println(i);
			}
		}
	}

}
