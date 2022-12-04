package assi1;

public class application {

	    private  vod v;
	    private etisalat e;
	    private orange o;
	    private we w ;
	    
	    private orange ob;
	    private vod  vob;
	    private we web;
	    private etisalat  etb;

	    public application(providersFactory factory) 
	    {
	         v=factory.createvodafoneI();
	         e=factory.createetisalatI();
	         o=factory.createorangeI();
	         w=factory.createweI();
	         
	         ob=factory.createorangeM();
	         vob=factory.createvodafoneM();
	         web =factory.createweM();
	         etb =factory.createetisalatM();
	         
	         
	    }
  
	    public void create() 
	    {
	        v.create();
	        e.create();
	        o.create();
	        w.create();
	        
	        ob.create();
	        vob.create();
	        web.create();
	        etb.create();
	    }
	    
}
