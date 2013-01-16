//Ex10x2
/**
* Interface for Book class in library application
* 3rd December 2012 - Created
* 5th December 2012 - Extended to include loan status
* 6th December 2012 - Amended
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include borrower
*/

public interface Book
{

	String getAuthor();
		//returns author of book

	String getTitle();
		//returns title of book

	LibraryUser getBorrower();
		//returns user that is currently borrowing book

	boolean isTaken();
		//returns loan status of book

	void setTaken(boolean b, LibraryUser u);
		//changes loan status of book

}
