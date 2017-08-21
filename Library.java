
//This program will show the working of the enum type in java and will
// try to access book 
public enum Library 
{
	JP1("java program1","403"),
	JP2("java program2","45"),
	JP3("java program3","413"),
	JP4("java program4","407"),
	JP5("java program5","409"),
	JP6("java program6","408"),
	JP7("java program7","503"),
	JP8("java program8","415"),
	JP9("java program9","430");

	private String bookTitle,bookPub;

	Library(String n1,String n2)
	{
		bookTitle=n1;
		bookPub=n2;
	}

	public String getTitle(){return bookTitle;}
	public String getBookPub(){return bookPub;}
}