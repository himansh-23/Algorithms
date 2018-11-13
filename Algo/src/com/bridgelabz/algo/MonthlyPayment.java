package com.bridgelabz.algo;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Payment=Integer.parseInt(args[0]);
		double Year=Double.parseDouble(args[1]);
		int Rate=Integer.parseInt(args[2]);
		
		double value=Utility.monthlyPayment(Payment,Year,Rate);
		System.out.println(value);
	}

}
