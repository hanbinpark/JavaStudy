package Person;

public class Main {

	public static void main(String[] args) {
		
		// Class가 실행되는 공간
		// 설계도를 사용해서 Object(객체)를 만드는 공간
		
		
		// 설계도의이름 변수명 = new 설계도의 이름();
		
		Person p1 = new Person("조자연",20,"여자",164,"광주");
		
		// . : 참조하다
//		p1.name = "조자연";
//		p1.age = 20;
//		p1.gender = "여자";
//		p1.height = 164;
//		p1.local = "광주";
		
		System.out.println("이름 : "+p1.name);
		System.out.println("나이 : "+p1.age);
		System.out.println("성별 : "+p1.gender);
		System.out.println("키 : "+p1.height);
		
		p1.breathe();
		p1.eat();
		p1.sleep();
		
		// + 설계도를 하나 만들어놓으면 여러개의 객체를 생성할 수 있다.
		// 짝궁의 이름, 나이, 성별, 키, 거주지
		// 설계도 Person을 사용해서 p2
		
		Person p2 = new Person();
		
		p2.name = "염다영";	
		p2.age = 26;
		p2.gender = "여자";
		p2.height = 160;
		p2.local = "광주";
		// p2.name = "염다";  // 재할당 가능 
		
		System.out.println("이름 : "+p2.name);
		System.out.println("나이 : "+p2.age);
		System.out.println("성별 : "+p2.gender);
		System.out.println("키 : "+p2.height);
		System.out.println("거주지 : " + p2.local);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		
		
		
		

	}

}
