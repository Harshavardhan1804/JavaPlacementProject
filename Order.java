package entity;

import util.InvalidOrderException;

public class Order {
	private static Inventory[] stock;
	private String orderid;
	private String item;
	private int orderQuantity;
	private double totalAmount;
	
	public void calculateBill(){
		
		Inventory inventory = CheckItemGetPrice(this.item);
		
		if(inventory==null){
			System.out.println(new InvalidOrderException());
		}
		
		this.totalAmount = inventory.getPrice() * this.orderQuantity;
		
		updateStock(inventory.getItemId(),inventory.getQuantity());
	}
//	public Inventory getId(String s){
//		for(Inventory i: stock){
//			if(i.getItemName().equals(s)){
//				return i;
//			}
//		}
//		return s;
//	}
	public Inventory CheckItemGetPrice(String s){
		
		for(Inventory i : stock){
			if(i.getItemName().equals(s)){
				return i;
			}
		}
		
		return null;
	}
	public void updateStock(String itemId, int quantity){
		for(Inventory i:stock){
			if(i.getItemId().equals(itemId)){
				i.setQuantity(i.getQuantity()-this.orderQuantity);
			}
		}
	}
	public String getItem() {
		return item;
	}
	public String getOrderid() {
		return orderid;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public static Inventory[] getStock() {
		return stock;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public static void setStock(Inventory[] stock) {
		Order.stock = stock;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
