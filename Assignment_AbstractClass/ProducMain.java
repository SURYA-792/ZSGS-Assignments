package Assignment_AbstractClass;

public class ProducMain {
	public static void main(String[] args) {

	}
}

abstract class Product{
	int productId;
	int productName;
	int price;
	String description;
	abstract int getPrice();
	abstract int getDescription();
}
