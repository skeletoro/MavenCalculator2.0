package mainPackage;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);

	public static double add() {
		System.out.println("enter first value to add");
		double valuea = scanner.nextDouble();
		System.out.println("enter second value add");
		double valueb = scanner.nextDouble();
		double answer = valuea + valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static double mult() {
		System.out.println("enter first value to multiply");
		double valuea = scanner.nextDouble();
		System.out.println("enter second value to multiply");
		double valueb = scanner.nextDouble();
		double answer = valuea * valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static double sub() {
		System.out.println("enter first value for subtraction");
		double valuea = scanner.nextDouble();
		System.out.println("enter second value for subtraction");
		double valueb = scanner.nextDouble();
		double answer = valuea - valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static double div() {
		System.out.println("enter first value for division");
		double valuea = scanner.nextDouble();
		System.out.println("enter second value for division");
		double valueb = scanner.nextDouble();
		double answer = valuea / valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

}
