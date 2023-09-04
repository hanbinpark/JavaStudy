package ex03for;

public class Ex09별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. 역으로 별찍기
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3. 
		
		for(int i = 1; i<= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
