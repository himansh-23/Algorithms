package com.bridgelabz.algo;

import java.io.*;
import java.util.Scanner;
public class BinarySearchFiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("Enter Search Element");
		String search=input.getString();
				Utility.searchInFile(search);
	}

}
