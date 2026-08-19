package chapter9TheInterfaceIsContract;

public interface Relatable {
	
	boolean equals(GradedActivity g);
	boolean isGreater(GradedActivity g);
	boolean isLess(GradedActivity g);

}


/*You might have guessed that the Relatable interface is named “Relatable” because it specifies methods that, presumably,
 *  make relational comparisons with GradedActivity objects. 
 * The intent is to make any class that implements this interface “relatable” with GradedActivity objects by 
 * ensuring that it has an equals, an isGreater, and an isLess method that perform relational comparisons.
 *  But, the interface specifies only the signatures for these methods, not what the methods should do.
 *  Although the programmer of a class that implements the Relatable interface can 
 *  choose what those methods do, he or she should provide methods that comply with this intent.*/
