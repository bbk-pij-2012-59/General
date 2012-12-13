//Ex10x2
/**
* Implementation of Book class in library application
* 3rd December 2012 - Created
* 5th December 2012 - Extended to include loan status
*/

public class LibraryBook implements Book
{

	private String bookAuthor;
	private String bookTitle;
	private boolean bookTaken;
	private LibraryUser bookBorrower;

	LibraryBook(String author, String title)
	/**
	*constructor - creates a new book
	* @param bookAuthor the author of the new book
	* @param bookTitle the title of the new book
	* @param bookTaken the loan status of the new book
	* @param bookBorrower the user that has borrowed the book
	*/
	{
		this.bookAuthor = author;
		this.bookTitle = title;
		this.bookTaken = false;
		this.bookBorrower = null;
	}


	public String getAuthor()
	/**
	*@return the author of the book
	*/
	{
		return this.bookAuthor;
	}

	public String getTitle()
	/**
	*@return the title of the book
	*/
	{
		return this.bookTitle;
	}

	public boolean isTaken()
	/**
	*@return the loan status of the book
	*/
	{
		return this.bookTaken;
	}

	//public void setTaken(boolean loanStatus, LibraryUser user)
	public void setTaken(boolean loanStatus)
	/**
	*changes the loan status of the book
	*/
	{
		if (this.bookTaken && !loanStatus)
		{
			this.bookTaken = false;
			//this.bookBorrower = null;
		}
		else if (!this.bookTaken && loanStatus)

		{
			this.bookTaken = true;
			//this.bookBorrower = user;
		}
	}

}
