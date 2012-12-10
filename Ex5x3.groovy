Ex5x3
//03/11/2012: Basic problem: couldn't see myMatrix after case 1 called, so had to construct it before switch; cases 2, 6 now working
//05/11/2012: 5 now adds correct commas and semi-colons; 3, 4 and 9 still have infinite loops, 7 and (hopefully 8) working
//08/11/2012: 3 and 4 now working; 9 works, but once you have run that option, you can't (re)run any of the other options
String str="", newRow = "", newColumn = "", newMatrix = "";
int switchNo = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, newValue = 0, x3 = 0, y4 = 0;
Boolean exitcmd = false;

System.out.print("How many rows do you want in your array? ");
str = System.console().readLine();
x1 = Integer.parseInt(str);
System.out.print("How many columns do you want in your array? ");
str = System.console().readLine();
y1 = Integer.parseInt(str);
Matrix myMatrix = new Matrix(x1,y1);

System.out.println("Options:");
System.out.println("To modify one element of your two-dimensional matrix, enter 2");
System.out.println("To modify one row of your two-dimensional matrix, enter 3");
System.out.println("To modify one column of your two-dimensional matrix, enter 4");
System.out.println("To print out your matrix using square brackets, commas, and semicolons, enter 5");
System.out.println("To print out your matrix as a table, enter 6");
System.out.println("To check if your two-dimensional matrix is symmetrical, enter 7")
System.out.println("To check if your two-dimensional matrix is triangular, enter 8")
System.out.println("To create a matrix and provide the values of all the elements, enter 9");
System.out.println("To exit, enter 0 or 1");
while (!exitcmd)
{	
	System.out.print("Your choice? ")
	str = System.console().readLine();
	switchNo = Integer.parseInt(str);
	switch (switchNo)
	{
	case 2:
		System.out.print("In which column is the element to be modified? ");
		str = System.console().readLine();
		y2 = Integer.parseInt(str);
		System.out.print("In which row is the element to be modified? ");
		str = System.console().readLine();
		x2 = Integer.parseInt(str);
		System.out.print("Please enter the new value of the element: ");
		str = System.console().readLine();
		newValue = Integer.parseInt(str);
		myMatrix.setElement(x2-1,y2-1,newValue);
		break;
	case 3:
		System.out.print("Which row of the array is to be modified? ");
		str = System.console().readLine();
		x3 = Integer.parseInt(str);
		System.out.print("Please enter the new values for the row (as a list of integers separated by commas): ");
		newRow = System.console().readLine();
		myMatrix.setRow((x3 - 1),newRow);
		break;
	case 4:
		System.out.print("Which column of the array is to be modified? ");
		str = System.console().readLine();
		y4 = Integer.parseInt(str);
		System.out.print("Please enter the new values for the column (as a list of integers separated by commas): ");
		newColumn = System.console().readLine();
		myMatrix.setColumn((y4 - 1),newColumn);
		break;
	case 5:
		System.out.println(myMatrix.toString());
		break;
	case 6:
		myMatrix.prettyPrint();
		break;
	case 9:
		System.out.print("Please enter the new values for the matrix (as a list of integers separated by commas and semicolons): ");
		newMatrix = System.console().readLine();
		//myMatrix.setMatrix(newMatrix);
		//Matrix myMatrix = new Matrix(newMatrix);
		myMatrix = new Matrix(newMatrix);
		break;
	case 7:
		if (myMatrix.symmetryCheck())
		{
			System.out.println("Your array is symmetrical.");
		}
		else
		{
			System.out.println("Your array is not symmetrical.");
		}
		break;
	case 8:
		if (myMatrix.triangularCheck())
		{
			System.out.println("Your array is triangular.");
		}
		else
		{
			System.out.println("Your array is not triangular.");
		}

		break;
	default:
		System.out.println("Bye!");
		exitcmd=true;
	}
}
