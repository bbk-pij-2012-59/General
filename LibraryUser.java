//Ex10x2
/**
* Implementation of Book class in library application
* 3rd December 2012 - Created
* 10th December 2012 -
*/
public class LibraryUser implements User
{

	private String userName;
	private int userID;
	private Library userLibrary;

	LibraryUser(String name)
	/**
	*constructor - creates a new user
	* @param name the name of the new user
	*/
	{
		this.userName = name;
		this.userID = 0;
	}

	public void setID(int id)
	/**
	*sets ID of user
	* @param id the ID of the new user
	*/
	{
		this.userID = id;
	}

	public String getName()
	/**
	*@return the name of the user
	*/
	{
		return this.userName;
	}

	public int getID()
	/**
	*@return the ID of the user
	*/
	{
		return this.userID;
	}

	public void register(Library lib)
	/**
	*registers user with library
	@param lib the library with which the user is registered
	*/
	{
		this.userLibrary = lib;
		this.userID = lib.getID(this);
	}

	public String getLibrary()
	/**
	@return the name of the library with which user is registered
	*/

	{
		return this.userLibrary.getName();
	}

}

