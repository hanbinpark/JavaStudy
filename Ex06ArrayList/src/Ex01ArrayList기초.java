import java.util.ArrayList;

public class Ex01ArrayList기초 {

	public static void main(String[] args) {
		// ArrayList를 사용해보자
		// : 가변 배열
		
		// 1. ArrayList 선언 및 초기화
		ArrayList<String> name = new ArrayList<>();
		// Object : 상속
		// Object로 데이터를 받아서 String으로 자동 형변환 하는 중...
		
		// import 단축키 : ctrl + shift + o
		// <> : 제네릭
		// 반드시 레퍼런스형 변수만 들어갈 수 있다.
		// ex) int ,float, double 사용불가
		// ex) String, Integer, Float ... 사용가능
		
		// 2. 데이터 추가하기 name.add()
		// 1) add(데이터값)
		name.add("조자연");
		name.add("송승호");
		name.add("박병관");
		// 2) add(인덱스 값, 데이터 값)
		name.add(1,"박호용");
		
		// 3. 데이터 가져오기
		// get(index)
		name.get(1);	// 출력기능 X
		System.out.println(name.get(1));
		
		// + for문을 사용해서 name에 전체 데이터를 출력해보자
		// ArrayList의 크기 : .size()
		
		for(int i = 0; i < name.size() ; i++) {
			System.out.println(name.get(i));
		}

		System.out.println(name.size());	// 4
		
		// 4. 데이터 삭제하기
		// 1) 선택해서 삭제 : remove(index)
		name.remove(2);
		System.out.println(name.size()); 	// 3
		System.out.println(name.get(2));
		// 2) 전체 삭제 : clear()
		name.clear();
		System.out.println(name.size());
		
		
		
		
		
		
		

	}

}
