/**
 * Compilation javac Binary.java
 * Execution java bridgelabz.algorithm.Binary 
 * Purpose: Finding Binary Of Any Number
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.bridgelabz.algo;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Utility input=new Utility();
		System.out.println("Enter Number to FindBinary");
		int Number=input.getInt();
		System.out.println("Binary of "+Number+" is "+Utility.binaryOfNumber(Number));
		
	}

}
