package TaskOfJava;

import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rem=0;
		int n1=count(n);
		String[] s=new String[n1];
		int i=0;
		while(n!=0)
		{
		rem=n%10;
		String s1="";
		s[i]=ConvertNumberToWords(rem);
		n=n/10;
		i++;
		}
		for(int j=n1-1;j>=0;j--)
		{
		System.out.print(s[j]+" ");
		}
		}

		private static int count(int n) {
		int count=0;
		while(n!=0)
		{
		count++;
		n/=10;
		}
		return count;
		}

		private static String ConvertNumberToWords(int rem) {
		switch(rem)
		{
		case 0:return "zero";
		case 1:return "one";
		case 2:return "two";
		case 3:return "three";
		case 4:return "four";
		case 5:return "five";
		case 6:return "six";
		case 7:return "seven";
		case 8:return "eight";
		case 9:return "nine";
		}
		return null;
		}
	}



