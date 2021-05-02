package Business.Concrete;
import Adaptor.Mernis.CustomerCheckService;
import Business.Abstract.CustomerManager;
import Database.Abstract.CustomerDal;
import Entities.Concrete.Customer;

public class StarbucksManager extends BaseCustomerManager implements CustomerManager {

	private CustomerDal customerdal;
	private CustomerCheckService customerCheckService;
	public StarbucksManager(CustomerDal customerdal,CustomerCheckService checkService) {
		this.customerCheckService =checkService;
		this.customerdal = customerdal;
	}
	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkPerson(customer)) {
			customerdal.add(customer);
		}else {
			System.out.println("islem basarýsýz");
		}
		
		
	}
	@Override
	public void delete(Customer customer) {
		customerdal.delete(customer);
		
	}
	@Override
	public void update(Customer customer) {
		if (customerCheckService.checkPerson(customer)) {
			customerdal.add(customer);
		}else {
			System.out.println("islem basarýsýz");
		}
		
	}


}
