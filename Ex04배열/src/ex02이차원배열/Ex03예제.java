package ex02이차원배열;

public class Ex03예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		int num = 21;
		
		// 21 ~ 45가 입력되는 방향으로 데이터를 대입 : 입력부
		
		// 1. 좌측상단부터 아래쪽으로 +1
		// 21 26 31 36 41
		// 22 27 32 37 42
		// ...
		// 25 30 35 40 45
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
		
		// 2. 우측상단부터 왼쪽으로 +1
		// 25 24 23 22 21
		// 30 29 28 27 26
		// ...
		// 45 44 43 42 41
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 4; j >= 0; j--) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
		
		// 3. 우측상단부터 아래쪽으로 +1
		// 41 36 31 26 21
		// 42 37 32 27 22
		// ...
		// 45 40 35 30 25
		
//		for(int i = 4; i >= 0; i--) {
//			for(int j = 0; j < 5; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
		
		// 4. 우측하단부터 위로 +1
		// 45 40 35 30 25
		// 44 39 34 29 24
		// ...
		// 41 36 31 26 21
		
//		for(int i = 4; i >= 0; i--) {
//			for(int j = 4; j >= 0; j--) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
		
		// 5. 리을자로 +1
		// 21 22 23 24 25
		// 30 29 28 27 26
		// ... 
		// 41 42 43 44 45
		
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = num;
					num++;
				}
			}else {
				for(int j = 4; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}
		
		
		// 출력부
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
