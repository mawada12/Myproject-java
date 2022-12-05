package Phase_1;

import java.util.Scanner;

public abstract class specific_Discount extends discount_Decorator{
	
	
	public double amount ;
	Scanner scanner = new Scanner(System.in);
	public String choice;
	
	public double calcspecific() 
	{
		 System.out.println("Enter your service ");
			choice = scanner.nextLine();

			if (choice.equals("mobile recharge service")) 
			{
				amount= amount*(20/100);
			}
			
			return amount;
	        
	}

			
}
