package sixtysix.plus.tree;

public class Owner extends Thing{
	public Owner(String name)
	{
		super(name);
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("Name: %s\nIdentity: Owner\n",super.getName());
	}
}
