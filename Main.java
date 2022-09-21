package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve ");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpeg");
				
		Product product2 = new Product();
		product2.setName("Smeg Kahve ");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image1.jpeg");

		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve ");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image1.jpeg");

		Product [] products= {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05050565");
		individualCustomer.setCustomerNumber("1235");
		individualCustomer.setFirstName("Ali");
		individualCustomer.setLastName("Aslan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("054874");
		corporateCustomer.setTaxNumber("211221");
		corporateCustomer.setCustomerNumber("5461");
		
		Customer [] customers = {
				individualCustomer,corporateCustomer
				
		};
		
	}
	
	

}
