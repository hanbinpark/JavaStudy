package 월급계산프로그램;

public class PartTimeEmployee extends Employee{

	private int workDay; // 일수

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

	public int getWorkDay() {
		return workDay;
	}
	
	
	
	
}
