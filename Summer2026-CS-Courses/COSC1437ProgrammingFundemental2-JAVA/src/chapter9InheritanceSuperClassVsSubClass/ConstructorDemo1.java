package chapter9InheritanceSuperClassVsSubClass;


 /**
  * This program demonstrates the order in which superclass
  * and subclass constructors are called.
  */

public class ConstructorDemo1 {

	public static void main(String[] args) {
		
		SubClass1 obj = new SubClass1();			//this object call super class constructor and sub class constructor 
		SuperClass1 obj2 = new SuperClass1();		//This object call super class constructor only
	}

}
