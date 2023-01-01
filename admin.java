package fawry;
import java.util.Scanner;

public class admin implements user {
	
	String email;
    Scanner cin = new Scanner(System.in);
    String username;
    String password;
	public admin(String email_, String username_, String password_) {
		// TODO Auto-generated constructor stub
		this.email=email_;
		this.password=password_;
		this.username=username_;
	}
	



	@Override
	public boolean signin(registerlist r, String email, String password) {
		// TODO Auto-generated method stub
		Boolean chk=r.checkAdmin(email, password);
		return chk;
	}

	@Override
	public boolean signup(registerlist r, String email, String username,String password) {
		// TODO Auto-generated method stub
		  Boolean chkad = r.checkAdmin(email, password);
	        if (!chkad) {
	            r.addAdmin(email, username, password);
	            return true;
	        }
	        return false;
		
	}
	public void adddiscount(registerlist r){
		  System.out.println("select type of discount  :\n 1.Specific \n 2.OverAll");
	        String type = cin.next();
	        System.out.println("Enter Amount of dicount ");
	        Double amount = cin.nextDouble();
	        discount dis = null;
	        if(type.equals("1")){
	            dis = new SpecificDiscount(amount);
	        }else if(type.equals("2")){
	            dis = new SpecificDiscount(amount);
	        }
	        System.out.println("Discount added successfully");
	        r.add_discount(dis);
		

    }
	public void viewRefunds(registerlist r) {
        int t = 1;
        for (refundtransactions refund : r.refund) {
            System.out.println(t + ". " + refund.tr.username + " requested " + refund.tr.amount );
            t++;
        }
    }
	 public void dealWithRefund(registerlist r) {
	        System.out.println("Enter Number of refund");
	        int c = cin.nextInt();
	        for (refundtransactions refund : r.refund) {
	            c--;
	            if (c == 0) {
	                System.out.println("1.Accept \n 2.Reject");
	                String refundNewState = cin.next();
	                if (refundNewState == "1") {
	                    refund.state = "Accepeted";
	                    refund.notifyAllObservers();
	                } else if (refundNewState == "2") {
	                    refund.state = "Rejected";
	                    refund.notifyAllObservers();
	                }
	                r.refund.remove(refund);
	                break;
	            }
	        }
	    }
	

}
