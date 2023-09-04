package ex03for;

public class Ex02for문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 출력
		// 그 중에서 홀수만 출력
		
		for(int i = 1; i <= 100; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i<= 100; i++) {
			if(i % 2 == 1)
				System.out.println(i);
			
		}
	}

}
