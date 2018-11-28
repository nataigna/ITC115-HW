import java.text.NumberFormat;

public class Product {
	private String productCode;
	private String description;
	private double price;
	private 
	int count;
	
	public Product(String initCode, String initDescription, double initPrice, int initCount) {
		productCode = initCode;
		description = initDescription;
		price = initPrice;
		count = initCount;
	}
	
	public void setCode(String newCode) {
		this.productCode = newCode;
	}
	
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public void setCount(int newCount) {
		this.count = newCount;
	}
	
	public String getCode() {
		return productCode;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		String outputString = "[" + productCode + ": " + description + "..." + count + " units remaining]";
		return outputString;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
}