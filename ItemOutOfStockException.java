package util;

public class ItemOutOfStockException extends Exception {
public ItemOutOfStockException() {
	// TODO Auto-generated constructor stub
	super("Item Out Of Stock");
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item Out Of Stock";
	}
}
