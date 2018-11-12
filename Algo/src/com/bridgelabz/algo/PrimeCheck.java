package com.bridgelabz.algo;
import java.util.Vector;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number Between 0 to 1000");
		Utility input=new Utility();
		int n=input.getInt();
		Vector <Integer> v1=Utility.primeCount(n);
		System.out.println(v1);
	}

}
