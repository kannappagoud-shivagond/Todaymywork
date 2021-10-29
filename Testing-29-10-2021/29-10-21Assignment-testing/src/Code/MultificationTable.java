package Code;

import java.util.Scanner;

public class MultificationTable {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");

		Scanner scan = new Scanner(System.in);

		n=scan.nextInt();
		System.out.println("Multiplication Table of "+n);
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+" X "+i+" = "+n*i);
		}
		}

	}


