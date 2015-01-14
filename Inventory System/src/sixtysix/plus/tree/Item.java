package sixtysix.plus.tree;

public class Item extends Thing{
	float price;
	int quantity;
	
	public Item(String name, float price)
	{
		super(name);
		quantity = 99;
		this.price = price;
	}

	@Override
	public void displayInfo() {
		System.out.printf("\t\t%s\t\tP%.2f\t\t%d", super.getName(), getPrice(), getQuantity());
	}
	
	public float getPrice()
	{
		return this.price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public void addQuantity(int x)
	{
		this.quantity+=x;
	}
	
	public void subQuantity(int x)
	{
		this.quantity-=x;
	}
}
