package ex03예제모음;

public class Ex01Resident {

	public static void main(String[] args) {
		
		
		String[][] resident = {{"박수현","강예진","임명진"},
								{"이명훈","박병관","임승환"},
								{"손동연","조준용","이진근"},
								{"송승호","송찬호","정봉균"}};
		
		for(int i = 400;i>=100;i-=100) {
			System.out.println("__________________________________");
			for(int j=1;j<4;j++) {
				System.out.print("|"+(i+j)+"호"+":"+resident[i/100-1][j-1]+"|");
			}
			System.out.println();
		}

	}

}
