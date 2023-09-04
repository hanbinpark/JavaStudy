package ex03for;

public class Ex11완전수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <= 1000; i++) {
			int perfectNum = 0;
			for(int j = 1; j <= i / 2; j++) {
				if(i % j == 0) {
					perfectNum += j;
				}
			}
			if(i == perfectNum) {
				System.out.println(i);
			}
		}

	}

}
