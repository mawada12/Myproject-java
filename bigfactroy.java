package fawry;


import java.util.Scanner;

public class bigfactroy {
	Scanner cin = new Scanner(System.in);

    public services createBig(String choice) { // choice = service name
        serviceproviderfactory providerFactory;
        String chooseProvider;
        services service = null;
        if (choice.equals("1") || choice.equals("2") || choice.equalsIgnoreCase("Mobile Recharge Service")
                || choice.equalsIgnoreCase("Internet Recharge Service")) {
            System.out.println("1.Vodafone \n 2.Etisalat \n 3.Orange \n 4.WE");
            chooseProvider = cin.next();
            if (chooseProvider.equals("1") || chooseProvider.equals("Vodafone")) {
                providerFactory = new vodafone();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("2") || chooseProvider.equals("Etisalat")) {
                providerFactory = new etisalat();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("3") || chooseProvider.equals("Orange")) {
                providerFactory = new orange();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("4") || chooseProvider.equals("WE")) {
                providerFactory = new we();
                service = providerFactory.Create(choice);
            }
        } else if (choice.equals("3") || choice.equalsIgnoreCase("Landline Service")) {
            System.out.println("1.Monthly Reciept \n 2.Quarter Receipt");
            chooseProvider = cin.next();
            if (chooseProvider.equals("1"))
                service = new monthlysubscribed();
            else service = new quartersubscribed();
        } else if(choice.equals("4") || choice.equalsIgnoreCase("Donation"))
            service = new donationservices();
        else
            System.out.println("No Such service Exist");
        return service;
    }
	

}
