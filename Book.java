//Ex10x2
/**
* Interface for Book class in library application
* 3rd December 2012 - Created
* 5th December 2012 - Extended to include loan status
* 6th December 2012 - Amended
*/

public interface Book
{

	String getAuthor();
		//returns author of book

	String getTitle();
		//returns title of book

	boolean isTaken();

	//void setTaken(boolean b, LibraryUser u);

		//void setTaken(boolean b);

}
