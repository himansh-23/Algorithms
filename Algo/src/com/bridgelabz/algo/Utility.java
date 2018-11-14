/**
 * Compilation javac Utility.java
 * Execution bridgelabz.algorithm.Utility
 * 
 * Purpose: For Providing Helper Input Method And Function
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.bridgelabz.algo;

import java.util.Scanner;
import java.util.Vector;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Utility 
{	
	//Scanner class Object Creation
	 public Scanner sc=new Scanner(System.in);
	
	/**
	 * To get Integer Input
	 * @return int
	 */
	public int getInt()
	{
		int i=sc.nextInt();
		return i;
	}
	/**
	 * To get Long Input
	 * @return long
	 */
	public long getLong()
	{
		long i=sc.nextLong();
		return i;
	}
	/**
	 * To get String Without Space's
	 * @return String
	 */
	
	public String getString()
	{
		String i=sc.next();
		return i;
	}
	/**
	 * To get String with Space's
	 * @return String
	 */
	
	public String getLine()
	{
		String i=sc.nextLine();
		return i;
		
	}
	/**
	 * To get Byte as Input
	 * @return byte
	 */
	public byte getByte()
	{
		byte i=sc.nextByte();
		return i;
	}
	
	public double getDouble()
	{
		double d=sc.nextDouble();
		return d;
	}
	/**
	 * Purpose-To Find Two String are anagram or not
	 * @param first
	 * @param second
	 * @return boolean
	 */
	public static boolean anagram(String first,String second)
	{
		if(first.length()!=second.length())
		{
			return false;
		}
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		
		for(int i=0;i<first.length();i++)
		{
			arr1[first.charAt(i)-97]++;
			arr2[second.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	/**
	 * Purpose-Count Prime Number from 0 to n and return all by storing in vector.
	 * @param n
	 * @return Vector Array
	 */
	public static Vector<Integer> primeCount(int n)
	{
		if(n<2)
		{
			System.out.println("No prime till this range");
		}
		else
		{
		Vector<Integer> v1=new Vector<>();
		v1.add(2);
		for(int i=3;i<=n;i=i+2)
		{
			boolean flag=true;
			for(int j=0;j<v1.size();j++)
			{
				if(i%v1.elementAt(j)==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
				v1.add(i);
			}
		}
		return v1;
		}
		return null;
				
	}
	/**
	 * Purpose For Finding Anagram Between Prime Numbers.
	 * @param n
	 * @return void
	 */
	public static void anagramPrimeCheck(int n)
	{
		Vector<Integer> v1=Utility.primeCount(n);
		Vector<String> s1=new Vector<>();
		int arr1[]=new int [10];
		int arr2[]=new int [10];
		for(int i=0;i<v1.size();i++)
		{
			int x=v1.elementAt(i).intValue();
			int xvalue=x;
			int count1=0;
			if(x<=9)
			{
				continue;
			}
			else	
			{
				while(x>0)
				{
					int temp1=x%10;
					x=x/10;
					arr1[temp1]++;
					count1++;
				}
			}
			for(int j=i+1;j<v1.size();j++)
			{
				int x2=v1.elementAt(j).intValue();
				int x2value=x2;
				int count2=0;
				if(x2<=9 || x2value==xvalue)
				{
					continue;
				}
				else
				{
					while(x2>0)
					{
						int temp2=x2%10;
						x2=x2/10;
						arr2[temp2]++;
						count2++;
					}
					
					if(count1==count2)
					{
						int k=0;
						for( k=0;k<10;k++)
						{
							if(arr1[k]!=arr2[k])
								break;
						}
						if(k==10)
						{
							s1.add(xvalue+" "+x2value);
						}
					}
				}
				Arrays.fill(arr2, 0);		
			}
			Arrays.fill(arr1, 0);	
		}
		System.out.println(s1);	
	}
	/**
	 * Purpose-Sort Integer Array Using Insertion Sort.
	 * @param arr
	 * @return void
	 */
	public static void insertionSortInt(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int index=i;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[index]<arr[j])
				{
					int temp=arr[index];
					arr[index]=arr[j];
					arr[j]=temp;
					index=j;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	/**
	 * Purpose-Sort String Using Insertion Sort.
	 * @param s
	 * @return void
	 */
	
	public static void insertionSortString(String s[])
	{
		for(int i=1;i<s.length;i++)
		{
			int index=i;
			for(int j=i-1;j>=0;j--)
			{
				if(s[index].compareTo(s[j])>0)
				{
					String temp=s[index];
					s[index]=s[j];
					s[j]=temp;
					index=j;
			
				}
			}
		}
		
	}
	
	/**
	 * Purpose-Bubble Sort For Integer Array
	 * @param arr
	 * @return void
	 */
	public static void bubbleSortInt(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	/*	for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}*/
	}
	/**
	 * Purpose-Bubble Sort For String
	 * @param arr
	 */
	public static void bubbleSortString(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length-1-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0) 
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
	}
	/**
	 * Purpose-Searching A string in String array
	 * @param s
	 * @param search
	 * @return void
	 */
	public static boolean binarySearchString(String s[],String search)
	{
		bubbleSortString(s);

		int lb=0;
		int ub=s.length;
		int mid=0;
		while(lb<=ub)
		{
			mid=(lb+ub)/2;
			if(mid==s.length)
			{
				return false;
			}
			if(s[mid].equals(search))
			{
				System.out.println("Element Found At "+mid);
				return true;
			}
			else if(s[mid].compareTo(search)>0)
			{
				ub=mid-1;
			}
			else
			{
				lb=mid+1;
			}
		}
		System.out.println("Element Not Found");
		return false;
	}
	/**
	 * Purpose-Searching A integer in integer array
	 * @param arr
	 * @param search
	 * @return void
	 */
	public static void binarySearchInteger(int arr[],int search)
	{
		bubbleSortInt(arr);
		int lb=0;
		int ub=arr.length;
		int mid=0;
		while(lb<ub)
		{
			mid=(lb+ub)/2;
			if(arr[mid]==search)
			{
				System.out.println("Element Found At "+mid);
				return;
			}
			else if(arr[mid]>search)
			{
				ub=mid-1;
			}
			else
			{
				lb=mid+1;
			}
			
		}
		System.out.println("Element Not Found");
	
	}
	
	public static int findNumber(int Range)
	{
		int lower=0;
		int upper=Range-1;
		Utility input=new Utility();
		int Answer=0;
		while(lower<=upper)
		{
			int mid=(lower+upper)/2;
			System.out.println("Is Your Number Between "+lower+" "+mid);
			String s=input.getString();
			
			if((upper==lower || lower+1==upper) && s.equals("true"))
			{
				Answer=lower;
				break;
			}
			else if((upper==lower || lower+1==upper) && s.equals("false"))
			{
				Answer=lower+1;
				break;
			}
			if(s.equals("false"))
			{
				lower=mid+1;
			}
			else if(s.equals("true"))
			{
				upper=mid-1;
			}
		}
		/*	if(lower==upper && s.equals("false"))
			{
				lower=lower+1;
				break;
			}
			else if(s.equals("true"))
			{
				upper=mid-1;
			}
			else
			{
			lower=mid+1;
			}*/
		return Answer;
		
	}
	
	public static void searchInFile(String search) throws IOException,NoSuchElementException
	{
		FileInputStream fis =new FileInputStream("SearchFile.txt");
		Scanner sc=new Scanner(fis);
		String stringarray=sc.next();
		stringarray+=",";
		//System.out.println(stringarray);
		String s1[]=stringarray.split(",");
		
		boolean flag=Utility.binarySearchString(s1, search);
		FileOutputStream fos=new FileOutputStream("SearchFile.txt");
		boolean flagcoma=false;
		if(flag==true)
		{
			for(int i=0;i<s1.length;i++)
			{
				if(s1[i].equals(search) )
				{
					if(i==0)
					{
						flagcoma=true;
					}
				continue;
				}
				
				if(i==0)
				{
					fos.write(s1[i].getBytes());
				}
				else if(i<s1.length)
				{
					if(flagcoma==true)
					{
						fos.write(s1[i].getBytes());
						flagcoma=false;
						continue;
					}
					s1[i]=","+s1[i];
					fos.write(s1[i].getBytes());
				}
			}
		}
		else
		{
			for(int i=0;i<s1.length;i++)
			{
				if(i==0)
				{
					fos.write(s1[i].getBytes());
					
				}
				else
				{
					s1[i]=","+s1[i];
					fos.write(s1[i].getBytes());

				}
			}
			search=","+search;
			fos.write(search.getBytes());
		}
	}
	
	public static void mergeSortOfString(String StringArray[],int lowerbound,int upperbound)
	{
		int mid=(lowerbound+upperbound)/2;
		if(lowerbound<upperbound)
		{
			
			Utility.mergeSortOfString(StringArray,lowerbound,mid);
			Utility.mergeSortOfString(StringArray,mid+1,upperbound);
			Utility.merging(StringArray,lowerbound,mid,upperbound);
			
		}
	}
	
	public static void merging(String StringArray[],int lowerbound,int mid,int upperbound)
	{
		String[] arr=new String[upperbound-lowerbound+1];
		
		int lowerstart=lowerbound;
		int upperstart=mid+1;
		int fill=0;
		while(lowerstart<=mid && upperstart<=upperbound)
		{
			
		if(StringArray[lowerstart].compareTo(StringArray[upperstart])<=0)
		{
			arr[fill]=StringArray[lowerstart];
			lowerstart++;
			fill++;
		}
		else
		{
			arr[fill]=StringArray[upperstart];
			upperstart++;
			fill++;
		}
		}
		while(lowerstart<=mid)
		{
			arr[fill]=StringArray[lowerstart];
			lowerstart++;
			fill++;
		}
		
		while(upperstart<=upperbound)
		{
			arr[fill]=StringArray[upperstart];
			upperstart++;
			fill++;
		}
		for(int kx=0;kx<fill;kx++)
		{
			StringArray[lowerbound]=arr[kx];
			lowerbound++;
		}

	}
	
	public static void minCoinCounter(int Price)
	{
		int NoteType[]= {1, 2, 5, 10, 50, 100, 500, 1000};
		int NoteCount[]=new int[NoteType.length];
		for(int start=NoteType.length-1;start>=0;start--)
		{
			NoteCount[start]=Price/NoteType[start];
			Price=Price%NoteType[start];
		}
		
		for(int start=NoteType.length-1;start>=0;start--)
		{
			System.out.println(NoteType[start]+"-->"+NoteCount[start]);
		}
	}
	
	public static double dayOfWeek(double month,double day,double year)
	{
		double year1 = year-(14-month)/12; 
		double x=year1+(year1/4)-(year1*100)+(year1/400);
		double month1= month+12*((14-month)/12)-2;
		double day1=(day+x+31*month1/12)%7;
		return day1;
		
	}
	
	public static int temperatureConversion(int temperature,boolean flag)
	{
		if(flag)
		{
			return (temperature*9)/5+32;
		}
		else
		{
			return (temperature-32)*5/9;
		}
	}
	
	public static double monthlyPayment(double Payment,double Year,int Rate)
	{
		double n=12*Year;
		int n1=(int)n;
		for(int i=0;i<n1;i++)
		{
			Payment=Payment+Payment*5/100;
		}
		return Payment;
	}
	
	public static double SquareRoot(double Number)
	{
		double t=Number;
		while(Math.abs(t-Number/t)>.000000000000001)
		{
			t=(t+Number/t)/2;
		}
		return t;
	}
	
	public static String binaryOfNumber(int Number)
	{
		String s="";
		while(Number>=1)
		{
			s+=Number%2;
			Number=Number/2;
		}
		String s2="";
		for(int start=s.length()-1;start>=0;start--)
		{
			s2+=s.charAt(start);
		}
		return s2;
	}
	
	public static int nibbleSwap(int Number)
	{
		String binaryString=binaryOfNumber(Number);
		int  x=8-binaryString.length();
		String s="";
		for(int i=0;i<x;i++)
		{
			s+="0";
		}
		
		binaryString=s+binaryString;
		String firstnibble=binaryString.substring(0,4);
		String secondnibble=binaryString.substring(4);
		binaryString=secondnibble+firstnibble;
		x=1;
		int changeNumber=0;
		for(int start=binaryString.length()-1;start>=0;start--)
		{
			changeNumber=changeNumber+(Integer.parseInt(binaryString.charAt(start)+""))*x;
			x=x*2;
		}
		return changeNumber;
	}
}