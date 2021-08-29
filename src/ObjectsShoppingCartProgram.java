import java.util.ArrayList;

public class ObjectsShoppingCartProgram {

	static class Product {
	private int number;
	private String name;
	private double price;
	public Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + ", toString()=" + super.toString()
				+ "]";
	}
	
}

static class ShoppingCart {
	private ArrayList<Item> itemList;
	
	public ShoppingCart(ArrayList<Item> itemList) {
		super();
		this.itemList = itemList;
	}
	
	
	public ArrayList<Item> getItemList() {
		return itemList;
	}


	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}


	public String toString() {
		return "ShoppingCart [itemList=" + itemList + ", toString()=" + super.toString() + "]";
	}


	public  ShoppingCart() {
	}
	public void add(Product product, int quantity) {
	}
	public double getTotalPrice() {
		return 0;
	}


	public void remove(Product product_2) {
		
		
	}
	
}

static class Item {
	private Product product;
	private int quality;
	public Item(Product product, int quality) {
		super();
		this.product = product;
		this.quality = quality;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String toString() {
		return "Item [product=" + product + ", quality=" + quality + ", toString()=" + super.toString() + "]";
	}

	public double getSubtotal() {
		return 0;
	}

}
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
        Product product_1 = new Product(10, "Bicycle", 500.00);
        Product product_2 = new Product(11, "Energy bar", 1.50);
        Product product_3 = new Product(12, "Water bottle", 6.00);
        
        System.out.println(cart);

        cart.add(product_1, 1);
        cart.add(product_2, 5);
        cart.add(product_3, 2);    
        System.out.println(cart);
        
        cart.remove(product_2);
        System.out.println(cart);

	}

}
