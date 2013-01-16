class LeisureDept
{

	public static void main(String[] args)
	{
		PublicLibrary lib1 = new PublicLibrary("Walthamstow Library");
		lib1.addBook("Easy Java", "Simon Simple");
		lib1.addBook("Complicated Java", "Simon Difficult");
		lib1.addBook("The ABC Murders", "Agatha Christie");
		LibraryUser user1 = new LibraryUser("John Smith");
		LibraryUser user2 = new LibraryUser("Jane Brown");
		LibraryUser user3 = new LibraryUser("Mary Jones");
		LibraryUser user4 = new LibraryUser("Paul Jones");

		//need to register users

		LibraryBook borrowed1 = user1.borrowBook("Easy Java");
		System.out.println(lib1.getName() + " has " + lib1.getReaderCount() + " registered users");
		System.out.println(lib1.getName() + " has " + lib1.getBookCount() + " books");
		System.out.println(lib1.getName() + " has " + lib1.getBookBorrowedCount() + " books on loan");
		user1.returnBook(borrowed1);
		System.out.println(lib1.getName() + " has " + lib1.getBookBorrowedCount() + " books on loan");

	}

}