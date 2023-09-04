package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product[] proList = new Product[5];

		//ArrayList<Product> list = new ArrayList<>();
		int cnt = 0;
		
		while(true) {
			// [1]물건추가 [2]예상판매량조회 [3]종료 >>
			System.out.print("[1]물건추가 [2]예상판매량 조회 [3]종료 >> ");
			int select = sc.nextInt();
			int sum = 0;
			
			if(select == 1) {
			    // 1) 물건추가
			    // - 사용자로 부터 입력받은 물건이름, 단가, 수량을 Product자료형으로 묶어주자
			    // - 해당 Product 자료형을 가진 변수를 배열에 저장하자
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int price = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
						
				proList[cnt] = new Product(name, price, amount);
				cnt++;

				//Product g = new Product(name, price, amount);
				//list.add(g);
				
			}else if(select == 2) {
			      // 2) 예상판매량조회
			      // - 객체배열에 저장되어있는 정보를 출력하자
			      // - 배열에 각각 저장되어있는 단가*수량의 총합을 출력하자 (판매 시 매출)
				System.out.println("제품명\t단가\t수량");
				for(int i = 0; i < cnt; i++) {
					System.out.println(proList[i].getName()+"\t"+proList[i].getUnitPrice()+"\t"+proList[i].getAmount()+"개");
//					System.out.print(list.get(i).getName() + "\t");
//					System.out.print(list.get(i).getUnitPrice() + "\t");
//					System.out.print(list.get(i).getAmount() + "\t");
					
					sum += proList[i].getUnitPrice() * proList[i].getAmount();
				}
				System.out.println("판매 시 매출 : " + sum + "원");
				
			}else if(select == 3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
		
		
		
		}
		sc.close();
	}

}
