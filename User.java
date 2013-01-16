/**Ex10x2x2/3 Interface for User class in library application
* 3rd December 2012 - Created
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include borrowing books
*/

public interface User
{

	void setID(int id);
		//sets ID of user

	String getName();
		//returns name of user

	void register(Library lib);
		//registers user with library

	String getLibrary();
		//returns library with which user is registered

	int getID();
		//returns ID of user

	LibraryBook borrowBook(String title);
		//borrows a book from the library

	void returnBook(LibraryBook book);
		//returns a book to the library

	int getNoBooksOut();
		//returns number of books currently being borrowed

	String[] getBooksBorrowed();
		//returns array with the titles of all the books the user is currently borrowing

}
