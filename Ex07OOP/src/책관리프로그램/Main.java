package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 객체 배열
		
		// vo --> value Object
		// 사람
		// 이름String, 나이int, 성별char
		
		// 자료형[] 레퍼런스변수명 = new 자료형[배열의크기];
		// BookData 자료형을 가진 변수들만 저장할 수 있다.
		BookData[] bookList = new BookData[5];
		BookData b1 = new BookData("Java",21000,"홍길동");
		BookData b2 = new BookData("C++",29000,"박문수");
		BookData b3 = new BookData("Database",31000,"김장독");
		BookData b4 = new BookData("Android",18000,"이순신");
		BookData b5 = new BookData("Web",26000,"김철수");
		// b1은 BookData 자료형을 가진 상태
		
		// 객체배열에 값을 대입
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		
		// b1 출력하기
		//System.out.println(bookList[0].getTitle());
		
		System.out.print("금액을 입력하세요 : ");
		int price = sc.nextInt();
		// bookList에 저장되어있는 책 중에서 가격이 입력받은 것보다
		// 작은 것들을 출력
		
		System.out.println("구매 가능한 책 목록");
		
		for(int i = 0; i < bookList.length; i++)
		if(price >= bookList[i].getPrice()) {
			System.out.println("["+bookList[i].getTitle()+ ", " + bookList[i].getWriter() + ", "+bookList[i].getPrice()+"원]");
			
		}
		sc.close();
		
		
	}

}
