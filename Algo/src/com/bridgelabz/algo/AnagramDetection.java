package com.bridgelabz.algo;

public class AnagramDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		String first=input.getString();
		String second=input.getString();
		boolean flag=Utility.anagram(first,second);
		if(flag)
			System.out.println("String's Are Anagram");
		else
			System.out.println("String's Are Not Anagram");
			
		
	}

}
