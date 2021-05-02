package Database.Concrete;
import Database.Abstract.CustomerDal;
import Entities.Concrete.Customer;

public class StarbucskDal implements CustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+" "+"Starbucks database kayýt eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks database kayýt silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Starbucks database kayýt güncellendi");
		
	}

	

}
