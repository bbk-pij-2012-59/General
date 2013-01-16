//Ex10x2
/**
* Implementation of Book class in library application
* 3rd December 2012 - Created
* 10th December 2012 - Amended
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include borrowing books
*/
public class LibraryUser implements User
{

	private String userName;
	private int userID;
	private Library userLibrary;
	private int noBooksBorrowed;
	private LibraryBook[] booksBorrowed;

	/**
	*constructor - creates a new user
	* @param name the name of the new user
	*/
	LibraryUser(String name)
	{
		this.userName = name;
		this.userID = 0;
		this.noBooksBorrowed = 0;
		this.booksBorrowed = new LibraryBook[5];
	}

	/**
	*sets ID of user
	* @param id the ID of the new user
	*/
	public void setID(int id)
	{
		this.userID = id;
	}

	/**
	*@return the name of the user
	*/
	public String getName()
	{
		return this.userName;
	}

	/**
	*@return the ID of the user
	*/
	public int getID()

	{
		return this.userID;
	}

	/**
	*registers user with library
	@param lib the library with which the user is registered
	*/
	public void register(Library lib)
	{
		this.userLibrary = lib;
		int tempID = lib.getID(this);
		this.setID(tempID);
	}

	/**
	@return the name of the library with which user is registered
	*/
	public String getLibrary()
	{
		return this.userLibrary.getName();
	}

	/**
	*borrows a book from the library
	@param title the title of the book to be borrowed
	*/
	public LibraryBook borrowBook(String title)
	{
		if (this.getNoBooksOut() < this.userLibrary.getMaxBooksPerUser())
		{
			LibraryBook borrowedBook = this.userLibrary.takeBook(title, this);
			for (int i = 0; i < 5; i++)
			{
				if (booksBorrowed[i] == null)
				{
					booksBorrowed[i] = borrowedBook;
					return borrowedBook;
				}
			}
		}
		else
		{
			System.out.print(this.getName());
			System.out.print(" has borrowed the maximum number of books permitted from ");
			System.out.println(this.getLibrary());
			return null;
		}
		return null;
	}

	/**
	*returns a book to the library
	@param book the book to be returned
	*/
	public void returnBook(LibraryBook returnedBook)
	{
		for (int i = 0; i < 5; i++)
		{
			if (booksBorrowed[i].equals(returnedBook))
			{
				booksBorrowed[i] = null;
				this.noBooksBorrowed--;
				return;
			}
		}
		System.out.print(this.getName());
		System.out.print(" is not currently borrowing ");
		System.out.print(returnedBook);
		System.out.println(" from " + this.getLibrary());
		return;
	}

	/**
	@return the number of books currently being borrowed by this user
	*/
	public int getNoBooksOut()
	{
		return this.noBooksBorrowed;
	}

	/**
	@return the titles of all the books currently being borrowed by this user (in an array)
	*/
	public String[] getBooksBorrowed()
	{
		String[] borrowings = new String[5];
		if (this.noBooksBorrowed > 0)
		{
			for (int i = 0; i < 5; i++)
			{
				borrowings[i] = this.booksBorrowed[i].getTitle();
			}
			for (int j = 0; j < 5; j++)
			{
				if (borrowings[j] == null)
				{
					borrowings[j] = borrowings[j + 1];
				}
			}
		}
		else
		{
			borrowings[0] = "No books are currently being borrowed by this user";
		}
		return borrowings;
	}

}
