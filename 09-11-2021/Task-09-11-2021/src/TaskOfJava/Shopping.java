package TaskOfJava;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		int id,quantity;
		String name;
		float price,grandTotal=0;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Item id");
		id=scan.nextInt();
		System.out.println("Enter Item name");
		name=scan.next();
		System.out.println("Enter quantity");
		quantity=scan.nextInt();
		System.out.println("Enter Price");
		price=scan.nextFloat();

		if(grandTotal>10000)
		{
		grandTotal+=grandTotal*0.1;
		System.out.println("you have to pay: "+grandTotal);
		break;
		}
		else
		{
		grandTotal+= quantity*price;
		System.out.println("you have to pay: "+grandTotal);
		}
		System.out.println("do you want to continue (y/n)");
		String choice= scan.next();
		if(choice.charAt(0)!='n')
		{

		}
		else
		{

		System.out.println("your total amt is: "+grandTotal);
		System.out.println("thanks for shopping with us");
		break;
		}

	}
	}
}

