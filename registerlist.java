package fawry;
import java.util.ArrayList;
import java.util.Scanner;


public class registerlist {
	ArrayList<consumer> consumerlst=new ArrayList<>();
	ArrayList<admin> addminslst=new ArrayList<>();
	Scanner cin = new Scanner(System.in);
	public void add(String email, String passwordd) {
		consumer c = new consumer(email,passwordd);
		consumerlst.add(c);
		
	}
	
	public Boolean check(String email, String password) {
        for (consumer value : consumerlst)
            if (value.email.equals(email) && value.password.equals(password))
                return true;
        return false;
    }
	
	
	
	

}
