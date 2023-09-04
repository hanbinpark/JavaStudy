package ex01while;

public class Ex04100까지의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지의 합은 : 5050
		
		int num = 1;	// 1부터 100까지 증가할 변수
		int sum = 0;	// 1부터 100까지의 합을 저장할 변수
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 100까지의 합은 : " + sum);
	}

}
