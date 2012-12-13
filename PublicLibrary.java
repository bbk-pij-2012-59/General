//Ex10x2
/**
* Implementation of Library class in library application
* 5th December 2012 - Created
* 6th December 2012 - Amended
* 10th December 2012 -
*/

public class PublicLibrary implements Library
{
	private String libraryName;
	private int maxBooksPerUser;
	private int noRegisteredUsers;
	private int nextID;
	private LibraryBook[] booksHeld = new LibraryBook[100];
	private int noBooksHeld;

	PublicLibrary(String name)
	/**
	*constructor - creates a new library
	* @param name the name of the new library
	*/
	{
		this.libraryName = name;
		this.maxBooksPerUser = 3;
		this.noRegisteredUsers = 0;
		this.nextID = 1001;
		this.noBooksHeld = 0;
	}

	public String getName()
	/**
	*@return the name of the library
	*/
	{
		return this.libraryName;
	}

	public int getID(User user)
	/**
	*@return the UserID
	*Will generate a UserID for a previously unregistered user
	*
	*/
	{
		if (user.getID() == 0)
		{
			user.setID (this.nextID);
			this.nextID++;
			this.noRegisteredUsers++;
		}
		return user.getID();
	}

	public int getMaxBooksPerUser()
	{
		return this.maxBooksPerUser;
	}

	public void addBook(String title, String author)
	/**
	*Adds a new book to the list (stored in an array) of books in this library
	*First creates a new book
	*Then store in array
	*Then increase no of books held
	*/
	{
		LibraryBook b = new LibraryBook(author, title);
		this.booksHeld[this.noBooksHeld] = b;
		this.noBooksHeld++;
	}

	public Book takeBook(String title)
	{
		for (int k = 0; k < this.noBooksHeld; k++)
		{
			if (this.booksHeld[k].getTitle() == title)
			{
				this.booksHeld[k].setTaken(this.booksHeld[k].isTaken());
				return this.booksHeld[k];
			}
		}
		return null;
	}

	public void returnBook(Book book)
	{
		for (int k = 0; k < this.noBooksHeld; k++)
		{
			if (this.booksHeld[k] == book)
			{
				this.booksHeld[k].setTaken(this.booksHeld[k].isTaken());
			}
		}

	}

	public int getReaderCount()
	{
		return this.noRegisteredUsers;
	}

	public int getBookCount()
	{
		return this.noBooksHeld;
	}

	public int getBookBorrowedCount()
	{
		int borrowed = 0;
		for (int i = 0; i < this.noBooksHeld; i++)
		{
			if ((booksHeld[i]).isTaken())
			{
				borrowed++;
			}
		}
		return borrowed;
	}

	//public User[] getCurrentBorrower()
	//{

	//}

	public User[] getAllUser()
	{
		User ListUser[] = new User[100];
		for (int j = 1001; j < this.nextID; j++)
			{
				//ListUser[j-1001] = getName(j);
			}
		return ListUser;
	}


}