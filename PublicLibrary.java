/**
* Ex10x2
* Implementation of Library class in library application
* 5th December 2012 - Created
* 6th December 2012 - Amended
* 10th December 2012 - Amended
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include info on registered users
*/

public class PublicLibrary implements Library
{
	private String libraryName;
	private int maxBooksPerUser;
	private int nextID;
	private LibraryBook[] booksHeld;
	private int noBooksHeld;
	private LibraryUser[] usersRegistered;
	private int noRegisteredUsers;

	/**
	*constructor - creates a new library
	* @param name the name of the new library
	*/
	PublicLibrary(String name)
	{
		this.libraryName = name;
		this.maxBooksPerUser = 3;
		this.noRegisteredUsers = 0;
		this.nextID = 1001;
		this.noBooksHeld = 0;
		this.booksHeld = new LibraryBook[100];
		this.usersRegistered = new LibraryUser[100];
	}

	/**
	*@return the name of the library
	*/
	public String getName()
	{
		return this.libraryName;
	}

	/**
	*@return the UserID
	*Will generate a UserID for a previously unregistered user
	*/
	public int getID(User user)
	{
		if (user.getID() == 0)
		{
			user.setID (this.nextID);
			this.nextID++;
			this.noRegisteredUsers++;
		}
		return user.getID();
	}

	/**
	* Sets the maximum number of books that can be borrowed by the same person
	* @param maxno the maximum number of books that can be borrowed
	*/
	public void setMaxBooksPolicy(int maxno)
	{
		this.maxBooksPerUser = maxno;
	}

	/**
	*@return the maximum number of books that can be borrowed by the same person
	*/
	public int getMaxBooksPerUser()
	{
		return this.maxBooksPerUser;
	}

	/**
	* Adds a new book to the list (stored in an array) of books in this library
	* First creates a new book
	* Then stores it in an array
	* Then increases the number of books held
	* @param title the title of the new book
	* @param author the author of the new book
	*/
	public void addBook(String title, String author)

	{
		LibraryBook b = new LibraryBook(author, title);
		this.booksHeld[this.noBooksHeld] = b;
		this.noBooksHeld++;
	}

	/**
	* A book is borrowed and marked as taken
	* @param the title of the book that is borrowed
	* @return the book (if it has not yet been taken) or null (if it has already been taken)
	*/
	public LibraryBook takeBook(String title, LibraryUser borrower)
	{
		for (int k = 0; k < this.noBooksHeld; k++)
		{
			if (this.booksHeld[k].getTitle().equals(title))
			{
				this.booksHeld[k].setTaken(this.booksHeld[k].isTaken(), borrower);
				return this.booksHeld[k];
			}
		}
		return null;
	}

	/**
	* A book is returned and marked as not taken
	* @param returnedBook the book that is returned
	*/
	public void returnBook(LibraryBook returnedBook)
	{
		for (int k = 0; k < this.noBooksHeld; k++)
		{
			if (this.booksHeld[k] == returnedBook)
			{
				this.booksHeld[k].setTaken(this.booksHeld[k].isTaken(), null);
			}
		}

	}

	/**
	* @return the number of users registered in this library
	*/
	public int getReaderCount()
	{
		return this.noRegisteredUsers;
	}

	/**
	* @return the number of books in this library
	*/
	public int getBookCount()
	{
		return this.noBooksHeld;
	}

	/**
	* @return the number of books in this library that are currently being borrowed
	*/
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

	/**
	* @return the users that are currently borrowing books in this library (as an array)
	*/
	public LibraryUser[] getCurrentBorrower()
	{
		int n = 0;
		LibraryUser[] currentBorrower = new LibraryUser[this.noRegisteredUsers];
		for (int k = 0; k < this.noRegisteredUsers; k++)
		{
			if (usersRegistered[k].getNoBooksOut() > 0)
			{
				currentBorrower[n] = usersRegistered[k];
			}
		}
		return currentBorrower;
	}

	/**
	* @return the users that are currently registered with this library (as an array)
	*/
	public LibraryUser[] getAllUser()
	{
		LibraryUser[] allUser = new LibraryUser[this.noRegisteredUsers];
		for (int j = 0; j < this.noRegisteredUsers; j++)
			{
				allUser[j] = usersRegistered[j];
			}
		return allUser;
	}


}