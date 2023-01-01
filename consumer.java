package fawry;
import java.util.Scanner;
import java.util.ArrayList;


public class consumer implements user,Observer  {
	   Scanner cin = new Scanner(System.in);
	   String name;
	    String email;
	    String password;
	    double wallet = 10000;
	    ArrayList<transactions> trarry = new ArrayList<>();

	public consumer(String mail,String u_name, String passwd) {
		this.email=mail;
		this.password=passwd;
		this.name=u_name;
		
		
	}

	@Override
	public boolean signin(registerlist r, String email, String password) {
		boolean exist=r.check(email, password);
		return exist;
	}
		
		
	

	@Override
	public boolean signup(registerlist r, String email,String username, String password) {
		boolean valdiate=r.check(email, password);
				if(!valdiate)
				{
					r.c_add(email,username, password);
					return true;
				}
					
		
		return false;
	}
	 public void refundRequest( registerlist r ) {
	        refundtransactions refund = null;
	        int counter = 1;
	        if(trarry.size()==0){
	            System.out.println("NO Transactions ");
	            return;
	        }
	        for (transactions tr : trarry) {
	            System.out.println("Transaction " + counter + " " + tr.amount);
	            counter++;
	        }
	        int choice = 0;
	        System.out.println("choose trancation to do refund request");
	        choice = cin.nextInt();
	        for (transactions tr : trarry) {
	            choice--;
	            if (choice == 0) {
	                refund = new refundtransactions(tr);
	                //refund.state = "pending";
	                break;
	            }
	        }
	        r.refund.add(refund);
	        System.out.println("Refund request completed");
	    }
	 public void viewDiscounts(registerlist r) {
	        int t = 1;
	        for (discount discount :r.discountarr) {
	           // System.out.println(t+ "/ " + discount.get_discount_info() + " " + discount.get_discount_amount());
	            t++;
	        }
	    }
	 public void walletFund() {
	        System.out.println("Amount you want to add to your wallet");
	        Double amount = cin.nextDouble();
	        System.out.println("Choose way of payment \n1.Credit Card  \n2.Cash");
	        String choice = cin.next();
	        payment p = null;
	        if (choice.equals("1"))
	            p = new visa();
	        else p = new cash();
	        p.pay(this,amount);
	        this.wallet+=amount;
	        System.out.println("Wallet Amount is "+wallet);
	    }

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("Customer " + name + " Got New Notification about Refund ! : " + message);
		
	}
}

	
	


	
