package ex02do_while;

public class Ex01do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do-while 
		// while(조건) 특징 - 조건을 먼저 확인한 후 true일 때만 반복실행
		// do-while(조건) 특징 - 무조건 한번은 실행한 후 조건이 true일 때 반복
		
		// 조건을 먼저 보고 반복을 해야하는 경우 - while
		// 일단 무조건 한번 실행해줘야하는 경우 - do-while
		
		int num = 130;
		
		do {
			System.out.println("야호!");
			num--;
		}while(num > 100);

	}

}
