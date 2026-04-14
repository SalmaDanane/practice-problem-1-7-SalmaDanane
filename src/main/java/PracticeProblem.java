import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner (System.in);

		System.out.print("Input a lowercase letter: ");

		String frstLet = input.next();

		System.out.print("Input another lowercase letter: ");
		String secLet = input.next();

		char val = frstLet.charAt(0);
		char mal = secLet.charAt(0);

		boolean bool = val < mal;

		System.out.println(bool);



	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");

		double num = input.nextDouble();
		boolean bool = num >= 0 && num <= 10;
		System.out.println(bool);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = input.nextDouble();
		boolean bool = num > 0 && num != 5;
		System.out.println(bool);

	}

	public static void q5() {
		//Write question 5 code here

		Scanner input = new Scanner (System.in);
		
		String naners = "banana";
		System.out.print("Input a word: ");

		naners = input.nextLine();

		boolean bool = !naners.equals("banana");
		System.out.println(bool);

	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		boolean bool = num % 2 == 0;
		System.out.println("The integer " + num + " is " + bool);

	}

}
