package chap99_homework.hw231019.employee;

public class RegularEmployee extends Employee {
	private int bonus;

	//정규직
	public RegularEmployee(int eno, String name, int pay, 
			int type, int bonus) {
		super(eno, name, pay, type);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay() / 12 + this.bonus / 12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("보너스 : " + bonus);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
