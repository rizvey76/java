import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Product{
	private String name;
	private int qty;
	private int price;
	
	
	
	
	
	public Product(String name, int qty, int price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
	
	
}

public class CollectionIter {
	public static void main(String[] args) {
		
		
		
		List<Product> list=Arrays.asList(
				new Product("Laptop",5,34000),
				new Product("Mainboard",6,50000),
				new Product("Keyboard",10, 5000)
				
				
				);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));    /// for loop
		}
		
		
		System.out.println("\n");  
		
		for(Product p:list) {
			System.out.println(p);  ///
		}
		
		System.out.println("\n"); 
		
		list.forEach((p)-> System.out.println(p)); ///Consumer Interface
		System.out.println("\n");
		
		list.forEach(System.out::println); ///By Method Reference
		
	}

}
