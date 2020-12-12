package ua.lviv.lgs.task_1;

public class SalaryPerHour implements Salary{

	double pricePerHour;
	int numberOfHour;
	public SalaryPerHour(double pricePerHour, int numberOfHour) {
		super();
		this.pricePerHour = pricePerHour;
		this.numberOfHour = numberOfHour;
	}
	
	@Override
	public void salary() {
		System.out.println("Працівник з фіксованою місячною зарплатою заробляє: " + pricePerHour*numberOfHour);
	}
}
