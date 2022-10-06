import java.util.Scanner;

public class Calculatetheaverage

{
	public static void main(String[] args)
	{
		// Here I don't understand why but if I don't put "try" Eclipse won't take out the yellow underline from the word "scan"
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("What's your first number? ");
			float num1 = scan.nextFloat();
			System.out.println("What's your second number? ");
			float num2 = scan.nextFloat();
			System.out.println("What's your third number? ");
			float num3 = scan.nextFloat();
			
			float avg = (num1 + num2 + num3) / 3;
			System.out.println("Your average is " + avg);
		}
		
		 
	}
	
}