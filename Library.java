//Ex10x2x3 Interface for Library class in library application
//3rd December 2012 - Created
//4th December 2012 - Extended
//10th December 2012 -

public interface Library
{

	String getName();

	int getID(User user);

	int getMaxBooksPerUser();

	void addBook(String title, String author);

	Book takeBook(String title);

	void returnBook(Book book);

	int getReaderCount();

	int getBookCount();

	int getBookBorrowedCount();

	//User[] getCurrentBorrower();

	User[] getAllUser();


}