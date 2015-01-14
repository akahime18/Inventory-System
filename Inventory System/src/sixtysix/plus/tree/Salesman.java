package sixtysix.plus.tree;

public class Salesman extends Employee{
	float sales;
	
	public Salesman(String ID, String name, float sales)
	{
		super(ID,name);
		this.sales = sales;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("ID: %s\tName:%s\tSales: %f\tIdentity: Salesman\n",super.getID(),super.getName(),this.sales);
	}
	
	public void addSales(float x)
	{
		sales+=x;
	}
	
	public float getSales()
	{
		return this.sales;
	}
}
