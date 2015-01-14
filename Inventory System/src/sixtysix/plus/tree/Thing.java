package sixtysix.plus.tree;

public abstract class Thing {
	private String name;
	
	public Thing(String name)
	{
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract void displayInfo();
}
