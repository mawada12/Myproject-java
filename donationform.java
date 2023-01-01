package fawry;
import java.util.HashMap;
import java.util.Scanner;

public class donationform extends form {
	String purpose = null;
	String amount = null;
	public void getDonationInformation() {
	    System.out.println("Enter purpose of donation: ");
	    purpose = cin.next();
	    System.out.println("Enter amount: ");
	    amount = cin.next();
	}
	
	

}
