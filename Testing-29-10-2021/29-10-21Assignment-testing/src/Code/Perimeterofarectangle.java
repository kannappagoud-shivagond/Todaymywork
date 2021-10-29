package Code;

import java.util.Scanner;

public class Perimeterofarectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter Hieght and width of ractangle:" );
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Area="+(n1*n2));
		System.out.println("Perimeter="+(2*(n1+n2)));

	}

}
