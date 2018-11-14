package com.bridgelabz.algo;

public class FindingANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Range=Integer.parseInt(args[0]);
		System.out.println("Choose Number Between 0 to "+(Range-1));
		int result=Utility.findNumber(Range);
		System.out.println("Your Number is "+result);
	}

}
