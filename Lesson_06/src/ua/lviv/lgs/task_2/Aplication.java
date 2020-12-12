package ua.lviv.lgs.task_2;

import com.lgs.lab.interface2.MyCalculator;

public class Aplication {

	public static void main(String[] args) {
		
		MyCalculator mc = new MyCalculator(10, 5);
		
		mc.plus();
		mc.minus();
		mc.multiply();
		mc.devide();
		
	}
	
}
