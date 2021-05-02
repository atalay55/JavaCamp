package Database.Concrete;
import Database.Abstract.CustomerDal;
import Entities.Concrete.Customer;

public class NeroDal implements CustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Nero database kay�t eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero database kay�t silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Nero database kay�t g�ncellendi");
		
	}

}
