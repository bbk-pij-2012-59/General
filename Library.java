//Ex10x2x3 Interface for Library class in library application
//3rd December 2012 - Created
//4th December 2012 - Extended
//10th December 2012 -
//20th December 2012 - Book class made into LibraryBook class

public interface Library
{

	String getName();

	int getID(User user);

	int getMaxBooksPerUser();

	void setMaxBooksPolicy(int maxno);

	void addBook(String title, String author);

	LibraryBook takeBook(String title, LibraryUser borrower);

	void returnBook(LibraryBook book);

	int getReaderCount();

	int getBookCount();

	int getBookBorrowedCount();

	LibraryUser[] getCurrentBorrower();

	LibraryUser[] getAllUser();


}