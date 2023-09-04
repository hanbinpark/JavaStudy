package ex02do_while;

import java.util.Scanner;

public class Ex03로그인프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do-while , while
		// 공통점 : 반복 횟수가 정해져있지 않다.
		// 차이점 : 조건을 먼저 보고 반복할 것인지 실행하고 조건을 볼 것인지
		
		// 로그인 프로그램
		// 아이디와 패스워드를 입력받아 일치하면 프로그램 종료
		// 일치하지 않으면 일치할 때까지 아이디와 패스워드를 입력받는다
		
		Scanner sc = new Scanner(System.in);
		String id = "AAA";
		String pw = "123";
		
		do {
			System.out.print("아이디를 입력해주세요 >> ");
			String inputId = sc.next();
			System.out.print("비밀번호를 입력해주세요 >> ");
			String inputPw = sc.next();
			
			// 문자열비교 .equals(비교할 대상)
			if(inputId.equals(id)&& inputPw.equals(pw)) {
				System.out.println("로그인 성공!");
				break;
			}
			
			System.out.println("로그인에 실패했습니다");
		}while(true);
		
		
	}

}
