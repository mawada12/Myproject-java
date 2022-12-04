package assi1;
import java.util.*;


public class user implements GUI {
	
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";

	
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

	public void setPhoneNumber(int pn)
	{
		this.phoneNumber = pn;
	}

	public int getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setEmail(String e)
	{
		this.Email = e;
	}

	public String getEmail() 
	{
		return Email;
	}
	
	private static void add() 
	{