//Ex10x2x2/3 Interface for User class in library application
//3rd December 2012 - Created

public interface User
{

	void setID(int id);
		//sets ID of user

	String getName();
		//returns name of user

	int getID();
		//returns ID of user

	void register(Library lib);
		//registers user with library

	String getLibrary();
		//returns library with which user is registered

}
