package ex01메서드;

public class Ex02매O리O {

	public static void main(String[] args) {

		// 매개변수 있고, 리턴타입있다.
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시되어 있다.(+ return)
		// 2개의 숫자를 빼기해준 결과값을 받을 수 있는 minus 라는 메서드
		
		
		minus(8,3);	// 출력 X
		System.out.println(minus(8,3));
		
	}// main 밖
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

}
