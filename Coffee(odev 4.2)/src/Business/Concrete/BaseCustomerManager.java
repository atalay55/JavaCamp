package Business.Concrete;

import Adaptor.Mernis.CustomerCheckService;
import Entities.Concrete.Customer;

public class BaseCustomerManager implements CustomerCheckService {
	@Override
	public boolean checkPerson(Customer customer) {
		return true;
	}

}
