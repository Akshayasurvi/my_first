package collectionDemo;

public class item {
	String itemName;
	float price;
	public item (String itemName, float price){
		this.itemName=itemName;
		this.price =price;
	}
	public String toString(){
		return "Item Name "+itemName+" Price "+price;
	}

}
