import java.util.Scanner;

public class totalpay
{

	public static void main(String[] args) 
	{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("How many hours have you worked? ");
			double hoursworked = scan.nextDouble();
			System.out.println("What's your hourly pay rate?");
			double hourlypay = scan.nextDouble();
			
			double overtime = ((hoursworked - 40.00)*1.50 * hourlypay);
			double extrahours = hoursworked - 40;
			
			if (hoursworked > 40.00)
			{
			System.out.println("Your total pay is " + ((hoursworked - extrahours) * hourlypay + overtime)); 
				}	
			else
			{
				System.out.println("Your total pay is " + (hoursworked * hourlypay));
			}
		}
								
		

	}
}

