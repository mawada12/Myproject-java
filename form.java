
package fawry;
import java.util.HashMap;
import java.util.Scanner;

public class form {
	  String Paymentway = null;
	    HashMap<String, String> fill = new HashMap<>();
	    Scanner cin = new Scanner(System.in);

	    public void paymentMethod() {
	    	while (Paymentway ==null);
	    	{
	        
	            System.out.println("Choose way of payment /1.Credit Card default /2.Wallet /3.Cash");
	            Paymentway = cin.next();
	    	}
	       
	    }

}
