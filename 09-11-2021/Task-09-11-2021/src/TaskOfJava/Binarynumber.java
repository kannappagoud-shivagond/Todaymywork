package TaskOfJava;

import java.util.Scanner;

public class Binarynumber {
	static int toDecimal(int n)
	{
	int num = n;
	int dec = 0;
	int base = 1;
	int temp = num;
	while (temp > 0) {
	int last_digit = temp % 10;
	temp = temp / 10;
	dec += last_digit * base;
	base = base * 2;
	}

	return dec;
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a binary number");
	int num= scan.nextInt();
	System.out.println("Decimal value of "+num+" is "+toDecimal(num));
	}
}