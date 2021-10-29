package Code;

import java.util.Scanner;

public class Perimeterofcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give the input of radius of circle:");
		double radius = sc.nextDouble();
		System.out.println("perimeter is = " + (2 * radius * Math.PI));
		System.out.println("area is = " + (Math.PI*radius * radius));
		


	}

}
