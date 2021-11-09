package TaskOfJava;

import java.util.Scanner;

public class FactOfNum {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n= sc.nextInt();
		if(n<0)
		{
		System.out.println("Factorial is not possible for negative number");
		System.exit(0);
		}
		else if(n==0)
		fact=1;
		if(n>0)
		{
		for(int i=1;i<=n;i++)
		{
		fact=fact * i;
		}
		}
		System.out.println("Factorial of "+n+" = "+fact);
	}

	}


