package sixtysix.plus.tree;

import java.io.IOException;
import java.util.Scanner;


public class InventorySystem { 
	public static void main(String[] args) {
		Clerk clerk = new Clerk("10304720","Pervin Tan");/* Clerk*/
		Salesman s1 = new Salesman("10304721", "Paul Jabines", 68.43f); /*Four Salesmen*/
		Salesman s2 = new Salesman("10300537", "Charles Canete", 69.99f);/**/
		Salesman s3 = new Salesman("10300538", "Karlo Gabucan", 504.44f);/**/
		Salesman s4 = new Salesman("10300539", "Gene Mangubat", 120.33f);/**/
		Owner owner = new Owner("Miranda Kerr"); /*Owner*/
		Inventory inv = new Inventory();
		while(true) /*LORD LOOP*/
		{
			clearConsole(); 
			System.out.println("INVENTORY SYSTEMS");
			System.out.print("Enter ID:");
			Scanner sc = new Scanner(System.in);
			String id = sc.next();
			
			if(id.equals("10304720")) /*CLERK*/
			{
				int flag=0;
				while(flag==0)
				{
					clearConsole();
					System.out.println("INVENTORY SYSTEMS");
					clerk.displayInfo();
					inv.displayInventory();
					System.out.print("Tasks\n[1] Replenish Stocks\n[2] Modify Price\n[3] Exit\nEnter Choice:");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1: /*Replenish Stocks*/
							System.out.print("Specify Item no.:");
							int itemnumber = sc.nextInt();
							if(itemnumber>5 || itemnumber<1)
							System.out.println("Wrong Item no.");
							System.out.print("How many?");
							int qty = sc.nextInt();
							inv.getItem(itemnumber).addQuantity(qty);
							System.out.println("Successfull!");
							break;
					case 2: /*Modify Price*/
							System.out.print("Specify Item no.:");
							int itemnumber1 = sc.nextInt();
							if(itemnumber1>5 || itemnumber1<1)
							System.out.println("Wrong Item no.");
							System.out.print("New price:");
							float price = sc.nextFloat();
							inv.getItem(itemnumber1).setPrice(price);
							System.out.println("Successfull!");
							break;
					case 3:/*Exit*/
							flag=1;
							break;
					default: /*Wrong choice*/
							System.out.println("Wrong choice.");
							break;
					}
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(id.equals("10304721") || id.equals("10300537")|| id.equals("10300538")|| id.equals("10300539"))/*SALESMEN*/
			{
				Salesman logged = null;
				if(id.equals("10304721")) logged = s1;
				else if(id.equals("10300537")) logged = s2;
				else if(id.equals("10300538")) logged = s3;
				else if(id.equals("10300539")) logged = s4;
				int flag=0;
				while(flag==0)
				{
					clearConsole();
					System.out.println("INVENTORY SYSTEMS");
					logged.displayInfo();
					inv.displayInventory();
					System.out.print("Tasks\n[1] Sell \n[2] Exit\nEnter Choice:");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1:/*Sell*/
							System.out.print("Specify Item no.:");
							int itemnumber = sc.nextInt();
							if(itemnumber>5 || itemnumber<1)
							{
								System.out.println("Wrong Item no.");
								break;
							}
							System.out.print("Proceed?Y/N");
							String proceed = sc.next();
							if(proceed.equals("Y"))
							{
								if(inv.getItem(itemnumber).getQuantity()>0)
								{
									inv.getItem(itemnumber).subQuantity(1);
									logged.addSales(inv.getItem(itemnumber).getPrice());
									System.out.println("Successfull!");
								}
								else{
									System.out.print("Out of stock!");
								}
							}
							break;
					case 2:
							flag=1;
							break;
					default:
							System.out.println("Wrong choice.");
							break;
					}
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	
			}
			else if(id.equals("owner"))/*OWNER*/
			{
				int flag=0;
				while(flag==0)
				{
					clearConsole();
					System.out.println("INVENTORY SYSTEMS");
					owner.displayInfo();
					System.out.print("Tasks\n[1] Display Sales\n[2] Display Inventory\n[3] Exit\nEnter Choice:");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1: /*Display list of employees and their sales*/
							System.out.printf("List of Employees\n");
							s1.displayInfo();
							s2.displayInfo();
							s3.displayInfo();
							s4.displayInfo();
							System.out.printf("Total Sales: %.2f", s1.getSales()+s2.getSales()+s3.getSales()+s4.getSales());
							break;
					case 2: /*Display inventory*/
							inv.displayInventory();
							break;
					case 3:
							flag=1;
							break;
					default:
							System.out.println("Wrong choice.");
							break;
					}
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else{
				System.out.println("Id not found!");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void clearConsole()
	{
		for(int x=0;x<50;x++) System.out.println();
	}
}
