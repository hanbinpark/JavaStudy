package 추상메서드;

public abstract class 조류 {

	// 추상메서드는 추상클래스만 포함가능
	// public abstract class 조류
	// 메서드를 설계만(선언만) ----> 추상메서드
	// 울기
	public abstract void cry();
	
	
	// 움직이기
	public abstract void move();
	
	
	//알낳기
	public void egg() {
		System.out.println("알을 낳는다");
	}
}
