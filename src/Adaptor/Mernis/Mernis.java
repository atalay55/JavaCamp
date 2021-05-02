package Adaptor.Mernis;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis  implements CustomerCheckService{
	@Override
	public boolean checkPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result= soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getTckn()),customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
}
