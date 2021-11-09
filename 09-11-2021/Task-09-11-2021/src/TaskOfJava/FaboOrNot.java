package TaskOfJava;

import java.util.Scanner;

public class FaboOrNot {
	static boolean IsPerfectSquare(int x)
	{
		int s = (int) Math.sqrt(x);
		return (s*s==x);
		
	}
	static boolean isFibonacci(int x)
	{
		return IsPerfectSquare(5*x*x + 4) ||  IsPerfectSquare(5*x*x - 4);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= scan.nextInt();

		if(IsPerfectSquare(5*n*n + 4) || IsPerfectSquare(5*n*n - 4))
		{
		System.out.println(n+" is Fibbonacci Number");
		}
		else
		System.out.println(n+ " is not Fibbonacci Number");
		
		

	}

}
