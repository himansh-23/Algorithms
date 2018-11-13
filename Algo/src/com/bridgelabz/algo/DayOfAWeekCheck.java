package com.bridgelabz.algo;

public class DayOfAWeekCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int month=Integer.parseInt(args[0]);
			int day=Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			double result=Utility.dayOfWeek(month,day,year);
			System.out.println((int)result);
		
	}

}
