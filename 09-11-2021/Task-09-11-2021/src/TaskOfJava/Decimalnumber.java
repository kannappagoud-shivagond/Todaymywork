package TaskOfJava;

import java.util.Scanner;

public class Decimalnumber {
	//to accept a decimal number. Display it in the binary form.

	public static void main(String[] args) {
		int n , count = 0,a;
		String x = " ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter decimal number:");
		n=sc.nextInt();
		while(n>0)
		{
			a=n % 2;
			if(a==1)
			{
				count++;
				
			}
			x=a+""+x;
			n=n/2;
		}
		System.out.println("binary number:"+x);
		
		
	}

}
