package chapter9TheInterfaceWithDefaultMethod;

public interface Displayable {
	
	default void display() 
	{
		System.out.println("This is a default display method");
	}

}
