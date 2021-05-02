import java.sql.Date;

import Adaptor.Mernis.Mernis;
import Business.Concrete.StarbucksManager;
import Database.Concrete.StarbucskDal;
import Entities.Concrete.Customer;

public class Main {

	
	public static void main(String[] args) {
		StarbucksManager starbucksManager = new StarbucksManager(new StarbucskDal(),new Mernis());
		Customer customer = new Customer();
		customer.setFirstName("Fatih");
		customer.setLastName("Atalay");
		customer.setTckn("6940687456");
		customer.setDateOfBirth(new Date(2041));
		
		
		starbucksManager.add(customer);
	}

}
