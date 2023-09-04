import java.util.ArrayList;

public class Ex03getMiddle {
	


	public static void main(String[] args) {

		getMiddle("power");
		getMiddle("test");
		
	}
	
	public static void getMiddle(String str) {
		ArrayList<Character> word = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			word.add(str.charAt(i));
		}
		if(word.size() % 2 == 0) {
			System.out.print(word.get(word.size()/2 - 1));
			System.out.print(word.get(word.size()/2));
		
			
		}else {
			System.out.print(word.get(word.size()/2));
		}
	}

}
