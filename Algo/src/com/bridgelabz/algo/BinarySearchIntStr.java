package com.bridgelabz.algo;

public class BinarySearchIntStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		
		String s[]= {"abc","ldi","bcd"};
		String search="ldi";
		Utility.binarySearchString(s, search);
		
		int arr[]= {9,1,7,3,2,4,6,5,8};
		int search1=5;
		Utility.binarySearchInteger(arr, search1);
		
		
	}

}
