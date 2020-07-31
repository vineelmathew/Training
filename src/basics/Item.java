package basics;

public class Item {

	String id;
	String itemname;
	double price;

	Item(String id, String itemname, double price) {
		this.id = id;
		this.itemname = itemname;
		this.price = price;
	}

	Item() {
		this("", "", 199.34);
	}

	String getid() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getitemName() {
		return itemname;
	}

	void setItemName(String Itemname) {
		this.itemname = Itemname;
	}

	Double getPrice() {
		return price;
	}

	void setPrice(Double price) {
		this.price = price;
	}
}
