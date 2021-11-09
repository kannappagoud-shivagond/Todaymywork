package TaskOfJava;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base:");
		int x=sc.nextInt();
		System.out.println("Enter the power:");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
		sum*=x;
		}
		System.out.println(x+" to the power of "+n+" ="+sum);

		}
		
	}


