//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class FactorialRunner
{
	public static void main ( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number for the factorial: ");
		int num = kb.nextInt();
		Factorial x = new Factorial();
		x.getFactorial(num);
	}
}
