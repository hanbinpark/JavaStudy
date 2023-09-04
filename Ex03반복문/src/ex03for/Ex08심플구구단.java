package ex03for;

public class Ex08심플구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("2단");
//		for(int i = 1; i <= 9; i++) {
//			int result = 2 * i;
//			System.out.println("2*"+i+"="+result);
//		}
		
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단:\t");
			for(int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.print(i + "*"+ j + "=" + result + "\t");
			}
			System.out.println();
		}

	}

}
