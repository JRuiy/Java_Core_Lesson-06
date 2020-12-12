package ua.lviv.lgs.task_1;

public class SalaryFixed implements Salary {

	double wager;
	
	public SalaryFixed(double wager) {
		super();
		this.wager = wager;
	}
	
	@Override
	public void salary() {
		System.out.println("Працівник з фіксованою місячною зарплатою заробляє: " + wager);
	}

}
