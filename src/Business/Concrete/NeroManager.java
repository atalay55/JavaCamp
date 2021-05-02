package Business.Concrete;
import Business.Abstract.CustomerManager;
import Database.Abstract.CustomerDal;
import Entities.Concrete.Customer;

public class NeroManager implements CustomerManager {

	private CustomerDal customerdal;

	public NeroManager(CustomerDal customerdal) {
		this.customerdal = customerdal;
	}

	@Override
	public void add(Customer customer) {
		customerdal.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customerdal.delete(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerdal.update(customer);
		
	}
	
	
	
}
