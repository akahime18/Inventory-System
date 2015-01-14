package sixtysix.plus.tree;

public class Inventory {
	Item item[] = new Item[5];
	public Inventory()
	{
		item[0] = new Item("Apple",14.99f);
		item[1] = new Item("Orange",5.00f);
		item[2] = new Item("Mango",12.25f);
		item[3] = new Item("Melon",57.22f);
		item[4] = new Item("Banana",10.00f);
	}
	
	public void displayInventory()
	{
		System.out.print("____________________________________________________________\n");
		System.out.printf("|  \t\tList of Items                              |\n|Item no.\tItem Name\tPrice\t\tQuantity   |\n");
		System.out.print("|  [1] ");item[0].displayInfo();System.out.print("         |\n");
		System.out.print("|  [2] ");item[1].displayInfo();System.out.print("         |\n");
		System.out.print("|  [3] ");item[2].displayInfo();System.out.print("         |\n");
		System.out.print("|  [4] ");item[3].displayInfo();System.out.print("         |\n");
		System.out.print("|  [5] ");item[4].displayInfo();System.out.print("         |\n");
		System.out.print("____________________________________________________________\n");
	}
	
	public Item getItem(int itemnumber)
	{
		if(itemnumber<1 || itemnumber>5)
			return null;
		return item[itemnumber-1];
	}
}
