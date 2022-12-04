package assi1;
import java.util.*;

public class ADMIN implements GUI {
	
		private String username = "";
		private String password = "";
		private String Email = "";
		private double discount ;
		
		
		private ArrayList<ADMIN> PendingADMIN = new ArrayList<ADMIN>();

		
		public void setUserName(String un)
		{
			
			this.username = un;
		}

		public String getUserName() 
		{
		
			return username;
		}

		public void setPassaword(String password) 
		{
			this.password = password;
		}

		public String getPassword() 
		{
			return password;
		}

		public void setEmail(String e) 
		{
			
			this.Email = e;
		}

		public String getEmail() 
		{
			return Email;
		}

		public void setdiscount(double disc)
		{
			this.discount = disc;
		}

		public double getdiscount() 
		{
		
			return discount;
		}

		
		public void setADMIN(ADMIN d) 
		{
			
			PendingADMIN.add(d);
		}

		public ArrayList<ADMIN> getADMIN() 
		{
			
			return PendingADMIN;
		}

		public boolean acceptrefundfrequest()
		{
			System.out.println("ADMIN accepted your REQUEST.");
			return true;
		}

	
		public boolean declinerequest() 
		{
			System.out.println("ADMIN declined your REQWEST.");
			return false;
		}

		public void signup() 
		
		{
			
			String un, pw, e;
			int pn;

			Scanner scanner = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			System.out.println("");
			System.out.println("Sign up :: ADMIN ");

			System.out.print("Enter Username: ");
			un = scanner.nextLine();
			setUserName(un);

			System.out.print("Enter password: ");
			pw = scanner.nextLine();
			setPassaword(pw);

			System.out.print("Enter E-Mail(optional): ");
			e = scanner.nextLine();
			setEmail(e);

			System.out.println("Successfully signed in.");
			System.out.println("Waiting for admin to varify request.");
			setADMIN(new ADMIN());
		}

		public void login() 
		
		{
		
			Scanner scanner = new Scanner(System.in);
			String userName = getUserName();
			String pass = getPassword();
			;
			String un, pw;
			System.out.println("");
			System.out.println("Login :: ADMIN");

			System.out.print("Enter username: ");
			un = scanner.nextLine();

			System.out.print("Enter password: ");
			pw = scanner.nextLine();

			if (un.equals(userName) && pw.equals(pass)) {
				System.out.println("Successfully login.");
			} else
				System.out.println("Invalid username or password.");

		}

}