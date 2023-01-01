package fawry;

public class etisalat extends serviceproviderfactory {

	@Override
	public mobilerechargeservice createmobileservice() {
		// TODO Auto-generated method stub
		return new etisalatmobileservice();
	}

	@Override
	public internetservices createInternetService() {
		// TODO Auto-generated method stub
		 return new etisalatinternetservice();
	}

}
