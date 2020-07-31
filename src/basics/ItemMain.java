package basics;

public class ItemMain {

	public static void main(String args[]) {
		Item Items[] = new Item[2];
		Item itemobj1 = new Item("cooldrink", "pepsi", 25.90);
		Item itemobj2 = new Item("paste", "colgate", 28.42);
		Items[0] = itemobj1;
		Items[1] = itemobj2;

		for (Item Itm : Items) {
			System.out.println("The product type is " + Itm.getid() + " " + " Name is " + Itm.getitemName() + " "
					+ " Price is " + Itm.getPrice());
		}
	}
}
