package chap99_homework.hw231019.employee;

public class ContractEmployee extends Employee {
	private int workDay;

	// 계약
	public ContractEmployee(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay() * this.workDay;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일수 : " + this.workDay);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
