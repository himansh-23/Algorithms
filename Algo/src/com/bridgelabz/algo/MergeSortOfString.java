package com.bridgelabz.algo;

public class MergeSortOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter No of Strings");
		int Number=input.getInt();
		String stringarray[]=new String[Number];
		
		for(int i=0;i<stringarray.length;i++)
		{
			stringarray[i]=input.getString();
		}
		System.out.print("bbb".compareTo("aaa"));
		Utility.mergeSortOfString(stringarray,0,stringarray.length-1);
		
		for(int start=0;start<stringarray.length;start++)
		{
			System.out.print(stringarray[start]);
		}
	}

}
