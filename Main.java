package assi1;
import java.util.*;
public class Main {

		public static void main(String[] args) 
		
		{
	
			Scanner scanner = new Scanner(System.in);

			String choice;
			user u = new user();
			ADMIN d = new ADMIN();

			while (true) 
			{
				System.out.println("Fawry application");
				System.out.println("1. Login as Admin.");
				System.out.println("2. Signup user.");
				System.out.println("3. Login user.");
				System.out.println("4. User refund request.");
				System.out.println("5. Check discount for user.");
				System.out.println("6. exit.");

				System.out.print("Enter your choice: ");
				choice = scanner.nextLine();

				if (choice.equals("1")) {
					System.out.println("Default Admin username: ADMIN");
					System.out.println("Default Admin Password: ADMIN");
					d.login();
					System.out.println("");
					continue;
				}

				else if (choice.equals("2")) 
				{
					u.signup();
					System.out.println("");
					continue;
				}

				else if (choice.equals("3"))
				{
					d.signup();
					System.out.println("");
					continue;
				}

				else if (choice.equals("4")) 
				{
					u.login();
					System.out.println("");
					continue;
				}

				else if (choice.equals("5")) {
					d.login();
					System.out.println("");
					continue;
				}

				else if (choice.equals("6"))
				{
					break;
				}
				
}
}
}