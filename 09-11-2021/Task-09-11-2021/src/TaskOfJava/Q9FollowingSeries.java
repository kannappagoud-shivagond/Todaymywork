package TaskOfJava;

import java.util.Scanner;

public class Q9FollowingSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.print("0 1 ");
		int i=3;
		while(i<=n)
		{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		i++;
		}
		System.out.println();
		//c
		int n5=1;
		int n6=2;
		System.out.println();
		System.out.print(n5+" ");
		System.out.print(n6+" ");

		for(int j=3;j<=n;j++)
		{
		if(j%2 != 0)
		{
		n5=n5+3;
		System.out.print(n5+" ");
		}
		else
		{
		n6= n6+4;
		System.out.print(n6+" ");
		}

		}
		System.out.println();
		int a= 1;
		int b = 5;
		int c = 8;
		int d=0;
		System.out.print(a+" "+b+" "+c+" ");
		for(int k=4;k<=n;k++)
		{
		d=a+b+c;
		a=b;
		b=c;
		c=d;
		System.out.print(d+" ");
		}
		}
}
