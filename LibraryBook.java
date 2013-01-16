//Ex10x2
/**
* Implementation of Book class in library application
* 3rd December 2012 - Created
* 5th December 2012 - Extended to include loan status
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include borrower
*/

public class LibraryBook implements Book
{

	private String bookAuthor;
	private String bookTitle;
	private boolean bookTaken;
	private LibraryUser borrower;

	/**
	*constructor - creates a new book
	* @param bookAuthor the author of the new book
	* @param bookTitle the title of the new book
	* @param bookTaken the loan status of the new book
	*/
	LibraryBook(String author, String title)
	{
		this.bookAuthor = author;
		this.bookTitle = title;
		this.bookTaken = false;
		this.borrower = null;
	}

	/**
	*@return the author of the book
	*/
	public String getAuthor()
	{
		return this.bookAuthor;
	}

	/**
	*@return the title of the book
	*/
	public String getTitle()
	{
		return this.bookTitle;
	}

	/**
	*@return the loan status of the book
	*/
	public boolean isTaken()
	{
		return this.bookTaken;
	}

	/**
	*@return the borrower of the book
	*/
	public LibraryUser getBorrower()
	{
		return this.borrower;
	}

	/**
	*changes the loan status of the book
	*/
	public void setTaken(boolean loanStatus, LibraryUser borrowedBy)
	{
		if (this.bookTaken && !loanStatus)
		{
			this.bookTaken = false;
			this.borrower = null;
		}
		else if (!this.bookTaken && loanStatus)

		{
			this.bookTaken = true;
			this.borrower = borrowedBy;
		}
	}

}


