package ex02연산자;

public class Ex05증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		// 변수의 값을 1 올리거나 1감소시키는 연산자
		
		int num = 10;
		//증가
		
		//System.out.println(++num);
		//System.out.println(num);
		//System.out.println(num++);
		//System.out.println(num);
		
		// ++가 변수 앞에 붙으면 -> 먼저 1증가하고 후처리
		// ++가 변수 뒤에 붙으면 -> 출력 먼저 그 다음 변수의 값 1 증가
		
		// 감소
		int num2 = 10;
		//System.out.println(--num2);
		//System.out.println(num2);
		
		//System.out.println(num2--);
		//System.out.println(num2);
		
		int opr = 0;
		opr += 3;
		
		System.out.println(opr++);  	// 3
		System.out.println(opr);  		// 4
		System.out.println(++opr);  	// 5
		System.out.println(opr);  		// 5
		System.out.println(opr--);  	// 5 
		System.out.println(opr);  		// 4
		System.out.println(--opr);  	// 3
		System.out.println(opr);  		// 3
		

	}

}
