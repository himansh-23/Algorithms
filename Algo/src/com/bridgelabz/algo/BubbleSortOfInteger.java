package com.bridgelabz.algo;

public class BubbleSortOfInteger {
	public static void main(String args[])
	{
		Utility input=new Utility();
		System.out.println("Enter Size Of Array");
		int Number=input.getInt();
		int IntegerArray[]=new int[Number];
		for(int start=0;start<Number;start++)
		{
			IntegerArray[start]=input.getInt();
		}
		Utility.bubbleSortInt(IntegerArray);
		for(int start=0;start<Number;start++)
		{
			System.out.print(IntegerArray[start]+" ");
		}
	}

}
