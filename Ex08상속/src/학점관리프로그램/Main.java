package 학점관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		System.out.println("==========학점 관리 프로그램==========");
		
		while(true) {
			
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램종료 >> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String number = sc.next();
				System.out.print("Java점수 : ");
				int scoreJava = sc.nextInt();
				System.out.print("Web점수 : ");
				int scoreWeb = sc.nextInt();
				System.out.print("Android점수: ");
				int scoreAndroid = sc.nextInt();
				
				Student s = new Student(name, number,scoreJava, scoreWeb, scoreAndroid);
				list.add(s);
				
			}else if(menu == 2) {
				
				System.out.println("==========전체조회==========");
				if(list.size() == 0)
					System.out.println("조회할 데이터가 없습니다.");
				else {
					System.out.println("이름\t학번\tJava\tAndroid\tWeb");
					for(int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getNumber() + "\t");
						System.out.print(list.get(i).getScoreJava() + "\t");
						System.out.print(list.get(i).getScoreAndroid() + "\t");
						System.out.println(list.get(i).getScoreWeb() + "\t");
					}
				}
				System.out.println("===========================");
				
			}else if(menu == 3) {
				System.out.print("검색할 이름 입력: ");
				String name = sc.next();
				boolean isCheck = false;
				System.out.println("==========학생검색==========");
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						isCheck = true;
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getNumber() + "\t");
						System.out.print(list.get(i).getScoreJava() + "\t");
						System.out.print(list.get(i).getScoreAndroid() + "\t");
						System.out.println(list.get(i).getScoreWeb() + "\t");
					}
				}
				
				if(isCheck == false) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}
				System.out.println("===========================");
			}else if(menu == 4) {
				System.out.println("학점 관리 프로그램을 종료합니다.");
				break;
			}else {
				
			}
			
			
		}
		
		
		
		
	}

}
