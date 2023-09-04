package ex03예제모음;

public class 스네이크모양만들기 {

	public static void main(String[] args) {
		//1.정수형 데이터를 저장할 수 있는 5x5짜리 배열 만들기.
		//2. 21~45까지의 숫자를 저장하고, 출력하기.
		
		int[][] snake = new int[5][5];
		
		int cnt=21;
		boolean right = true;
		for(int i=0; i<snake.length;i++) {

				if(right) { // 오른쪽 방향으로 넣고 싶어요.
					for(int j=0;j<snake[i].length;j++) {
						snake[i][j] =cnt++;
						right = false;
					}
				}else { // 왼쪽 방향으로 넣을래요.
					for(int j=snake[i].length-1;j>=0;j--) {
						snake[i][j] =cnt++;
						right = true;
					}
				}
				
			}
		for(int i=0;i<snake.length;i++) {
			for(int j=0;j<snake[i].length;j++) {
				System.out.print(snake[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
