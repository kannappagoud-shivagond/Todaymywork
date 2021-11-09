package TaskOfJava;

import java.util.Scanner;

public class Code1PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			int flag=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					flag=0;
				
			}
			if(flag==1)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("sum"+sum);
		
	}

}
