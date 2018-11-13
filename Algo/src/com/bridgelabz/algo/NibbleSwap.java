package com.bridgelabz.algo;

public class NibbleSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		int Number=input.getInt();
		Number=Utility.nibbleSwap(Number);
		System.out.println("Result Is"+Number);
	}

}
