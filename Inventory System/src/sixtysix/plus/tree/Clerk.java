package sixtysix.plus.tree;

public class Clerk extends Employee{
	
	public Clerk(String ID, String name)
	{
		super(ID,name);
	}

	@Override
	public void displayInfo() {
		System.out.printf("ID: %s\tName: %s\tIdentity: Clerk\n",super.getID(),super.getName());
	}


}
