package 상품관리프로그램;
// 객체 -> 자료형(레퍼런스 자료형)
public class Product {
	// class -> 객체 -> 자료형
	// 자료형 <- 데이터를 담을 수 있는 형태
	// 내가 정의한 자료형태를 담을 수 있다
	
	// 생성자
	// 객체를 생성하는 역할
	// 객체를 생성할 때 반드시 한 번만 호출이 된다
	// 생성자를 만들지 않아도 사용할 수 있는 이유는?
	// -> 기본생성자가 존재하기 때문에
	// 특징 1. 리턴타입 X
	//     2. 이름이 클래서명과 동일
	
	// 속성(필드) <- 데이터를 담을 수 있는 변수
	private String name;
	private int unitPrice;
	private int amount;
	
	// 행위(메서드) <- 데이터를 가지고 움직이는 함수
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public int getAmount() {
		return amount;
	}
}
