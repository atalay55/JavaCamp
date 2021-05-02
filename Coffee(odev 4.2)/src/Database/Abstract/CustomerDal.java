package Database.Abstract;

import Entities.Concrete.Customer;

public interface CustomerDal {

	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}


