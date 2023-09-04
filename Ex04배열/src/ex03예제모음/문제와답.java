package ex03예제모음;

import java.util.Scanner;

public class 문제와답 {

	public static void main(String[] args) {
		
		int[] comAns = {1,4,3,2,1};
		int[] userAns = new int[5];
		String[] check = new String[5];
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i=0;i<userAns.length;i++) {
			System.out.print(i+1+"번답 >>");
			userAns[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for(int i=0;i<userAns.length;i++) {
			if(userAns[i]==comAns[i]) {
				System.out.print("O ");
				cnt+=20;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("총 점 : " + cnt);
	}		
}
