package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer musteri = new IndividualCustomer();
		musteri.customerNumber = "1";
		
		CorporateCustomer sirket = new CorporateCustomer();
		sirket.customerNumber = "2";
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(sirket);
		customerManager.add(musteri);
		
		System.out.println("-------------------------------");
		Customer[] customers = {sirket,musteri};
		
		customerManager.addMultiple(customers);
	}

}
