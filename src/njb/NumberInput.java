package njb;

import java.util.Scanner;

public class NumberInput {
	double number1;
	double number2;
	
	
	public void NumberInputObj()
	{
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Input first Number: ");
		number1 = read.nextDouble();
		
		System.out.println("Input second Number: ");
		number2 = read.nextDouble();
		read.close();
}
}
