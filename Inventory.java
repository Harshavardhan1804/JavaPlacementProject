package entity;

public class Inventory {
	private String itemId;
	private String itemName;
	private int quantity;
	private double price;
	
	public Inventory(String itemId,String itemName,int quantity,double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemId() {
		return itemId;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
