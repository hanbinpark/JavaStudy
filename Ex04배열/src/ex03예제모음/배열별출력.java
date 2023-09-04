package ex03예제모음;

public class 배열별출력 {

	public static void main(String[] args) {
		int[] starcount = {3,4,4,2,1};
		
		for(int i=0; i<starcount.length;i++) {
			System.out.print(starcount[i]+" : ");
			for(int j=0;j<starcount[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
