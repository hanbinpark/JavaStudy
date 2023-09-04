package ex02연산자;

import java.util.Scanner;

public class Ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3723 -> 1시간 2분 3초
		// Scanner 단축키 : sc -> ctrl + space
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");		
		int totalSecond = sc.nextInt();
		int second = totalSecond % (60 * 60) % 60; //totalSecond % 60;
		int minute = totalSecond % (60 * 60) / 60; //totalSecond / 60 % 60;
		int hour = totalSecond / (60 * 60);
		
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
		
	}

}
