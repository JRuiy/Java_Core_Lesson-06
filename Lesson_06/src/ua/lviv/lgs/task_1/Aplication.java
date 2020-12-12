package ua.lviv.lgs.task_1;

public class Aplication {

	public static void main(String[] args) {
		
		SalaryFixed sf = new SalaryFixed(5000.0);
		sf.salary();
		SalaryPerHour sph = new SalaryPerHour(100, 180);
		sph.salary();
	}
	
}
