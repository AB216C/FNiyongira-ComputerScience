package chapter6DefaultConstructorsAndReturnObjectFromMethods;

public class PassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object for InventoryItem class using its 3rd constructor
		
		InventoryItem item = new InventoryItem("Hammer", 25);
		
		
		//Pass the object to DisplayItem method
		
		displayItem(item);
		
		
		
		
		
		
		
		
		
		

	}     //Notice this closing brace closes the main method and our displayItem method is created inside PassObject class
	
		//Notice static method can be declared inside any class in any order. Now it is inside PassObject class
	
	
	
	//The following method accepts an inventoryItem object as an argument and display its content
	public static void displayItem(InventoryItem i) 
	{
		System.out.println("Description:" + i.getDescription());
		System.out.println("Units:" + i.getUnits());
	}

}
