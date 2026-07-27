package chapter6TheAggregation;

/*This class stores information about textbook*/

public class TextBook {
	
	private String title,
				   author,
				   publisher;
	
	
	/*
	 * This constructor accept  arguments for the title, author and publisher
	*/
	
	public TextBook (String textTitle, String auth, String pub) 
	{
		title = textTitle;
		author = auth;
		publisher = pub;
	}
	
	
	/*COPY CONSTRUCTOR*/
	
	public TextBook(TextBook object2)
	{
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
	}
	
	
	/*
	 * set method---sets each field
	 * */
	
	public void set(String textTitle, String auth, String pub) 
	{
		title = textTitle;
		author = auth;
		publisher = pub;
	}
	
	
	/*toString method--return a string containing textbook information */
	
	public String toString() 
	{
		String str = "Title:" + title 
					+"\nAuthor: " + author
					+"\nPublisher:" + publisher;
		
		return str;
	}

}
