package ex01메서드;

public class Ex03매O리X {

	public static void main(String[] args) {

		// 매개변수 있고, 리턴타입 없다. (void ---> 텅빈)
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시 X(return 키워드가 안온다)
		// void가 오는 경우는 메서드가 순수하게 기능 자체를 가지고 있는 경우
		// ex) syso, compile을 하는 기능..
		
		// sumPrint : 숫자 2개를 전달받아서 더한 결과값을 출력해주는 기능
		sumPrint(3,5);
		
		// System.out.println(sumPrint(3,5));	// '출력하는 기능'을 출력하려고 해서 발생한 오류
		
		
	}
	
	// sumPrint 만들기
	public static void sumPrint(int a,int b) {
		System.out.println(a + b);
		
		// void라는 리턴타입은 return X
		
	}

}
