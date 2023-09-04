package ex02연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술연산자
		int num1 = 7;
		int num2 = 3;
		
		int result1 = num1 + num2;
		System.out.println(result1);
		
		int result2 = num1 - num2;
		System.out.println(result2);
		
		int result3 = num1 * num2;
		System.out.println(result3);
		
		int result4 = num1 / num2;
		System.out.println(result4);
		
		double result5 = 7 / 3.0;
		System.out.println(result5);
		
		int result6 = num1 % num2;
		System.out.println(result6);
		
		
		// 문자열과 숫자를 더한다면 어떻게 될까?
		System.out.println("바나나" + 8 + 2);
		System.out.println("바나나" + (8 + 2));
		System.out.println("바나나" + 3 * 2);
		System.out.println("81" + 3 * 2 + 2 + 4);
		// "81" +6 +
		
	}

}
