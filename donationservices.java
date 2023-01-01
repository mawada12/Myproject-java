package fawry;

import java.util.Scanner;

public class donationservices implements services {
	double amount ;
	form f=new form();
	 Scanner cin = new Scanner(System.in);

	@Override
	public void display() {
		System.out.println("donation  service");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		System.out.println("paying donation  service");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeform() {
		  String donateplaces;
	        String amount;
	        System.out.println("Enter the Organization :");
	        donateplaces = cin.next();
	        System.out.println("Amount to Donate :");
	        amount = cin.next();
	        f.fill.put("Organization",donateplaces);
	        f.fill.put("Amount" , amount);
	        f.paymentMethod();
	        print_cost();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setamount(Double amount) {
		this.amount=amount;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getamount() {
		// TODO Auto-generated method stub
		return amount;
	}
	void print_cost()
	{
		System.out.println("cost of donation is "+amount);
	}

	@Override
	public void setform(form f) {
		// TODO Auto-generated method stub
		
	}

}
