package fawry;

public class cash implements payment  {

	@Override
	public transactions pay(consumer customer, double amount) {
		// TODO Auto-generated method stub
		 transactions tr = new transactions();
	        System.out.println("Cash Payment");
	        tr.amount = amount;
	        tr.username = customer.name;
	        return tr;
	
	}


		
		
		
	

}
