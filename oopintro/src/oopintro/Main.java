package oopintro;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id=1;
		product.name="kalem";
		product.uniteprice=21;
		product.details="faber kalem";
		
		Product product1 = new Product();
		product1.id=1;
		product1.name="kalem";
		product1.uniteprice=21;
		product1.details="faber kalem";
		
		Product product2 = new Product();
		product2.id=1;
		product2.name="kalem";
		product2.uniteprice=21;
		product2.details="faber kalem";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addCart(product);
		
	}

}
