package sixtysix.plus.tree;

public abstract class Employee extends Thing{
	private String ID;
	public Employee(String ID, String name)
	{
		super(name);
		this.ID = ID;
	}
	
	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	public String getID()
	{
		return this.ID;
	}

	
}
