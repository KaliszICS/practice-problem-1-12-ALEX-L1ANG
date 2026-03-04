/*
Author: Alex Liang
Lesson: 1.12 Converting Data Types
Date Created: Mar 4, 2026
Date Last Modified: Mar 4, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer: ");
	int int1 = input.nextInt();
	int int2 = int1 + 3;
	System.out.println(int2);
	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num = input.nextInt();
	double dnum = Double.parseDouble(num + 4);
	System.out.println(dnum);
	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a radius: ");
	double radius = input.nextDouble();
	double dradius = Double.parseDouble(radius * radius * 3.14);
	System.out.println(dradius);
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	double num1 = input.nextDouble();
	double num2 = Double.parseDouble(Math.round(num1 * 12));
	System.out.println(num2);
	}

}
