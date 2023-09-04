package ex02이차원배열;

public class Ex02이차원배열예제 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		// 00 01 02 03 04
		// 21 22 23 24 25
		
		// 10 11 12 13 14
		// 26 27 28 29 30
		
		int num = 21;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
