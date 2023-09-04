package ex01메서드;

public class Ex06메서드예제 {

	public static void main(String[] args) {
		
		// 2개의 양수를 받아 2개의 숫자 중 더 큰 수를 반환하는 메서드 만들기
		// 단, 두 숫자가 같다면 0을 반환하기

		int num1 = 10;
		int num2 = 24;
		
		int result = largerNumber(num1,num2);
		
		System.out.println("큰 수 확인 : " + result);
		
		// 1) 메서드명: largerNumber
		// 2) 전달인자 : 매개변수 자료형 int 2개
		// 3) 리턴타입이 int 이다.
	}
	
	public static int largerNumber(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1;
		}else if(num1 < num2) {
			result = num2;
		}else {
			result = 0;
		}
		return result;
	}

}
