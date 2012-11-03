Ex5x3
//Basic problem: can't see myMatrix after case 1 called
String str="", newRow = "", newColumn = "", newMatrix = "";
int switchNo = 9, x1 = 0, y1 = 0, x2 = 0, y2 = 0, newValue = 0, y3 = 0, x4 = 0;
Boolean exitcmd = false;

System.out.println("Options:");
System.out.println("To create a matrix and provide the values of all the elements, enter 0");
System.out.println("To create a two-dimensional matrix with all elements set to '1', enter 1");
System.out.println("To modify one element of your two-dimensional matrix, enter 2");
System.out.println("To modify one row of your two-dimensional matrix, enter 3");
System.out.println("To modify one column of your two-dimensional matrix, enter 4");
System.out.println("To print out your matrix using square brackets, commas, and semicolons, enter 5");
System.out.println("To print out your matrix as a table, enter 6");
System.out.println("To check if your two-dimensional matrix is symmetrical, enter 7")
System.out.println("To check if your two-dimensional matrix is triangular, enter 8")
System.out.println("To exit, enter 9");
while (!exitcmd)
{	
	System.out.print("Your choice? ")
	str = System.console().readLine();
	switchNo = Integer.parseInt(str);
	switch (switchNo)
	{
	case 1:
		System.out.print("How many columns do you want in the array? ");
		str = System.console().readLine();
		x1 = Integer.parseInt(str);
		System.out.print("How many rows do you want in the array? ");
		str = System.console().readLine();
		y1 = Integer.parseInt(str);
		Matrix myMatrix = new Matrix(x1,y1);
		break;
	case 2:
		System.out.print("In which column is the element to be modified? ");
		str = System.console().readLine();
		x2 = Integer.parseInt(str);
		System.out.print("In which row is the element to be modified? ");
		str = System.console().readLine();
		y2 = Integer.parseInt(str);
		System.out.print("Please enter the new value of the element: ");
		str = System.console().readLine();
		newValue = Integer.parseInt(str);
		myMatrix.setElement(x2-1,y2-1,newValue);
		break;
	case 3:
		System.out.print("Which row of the array is to be modified? ");
		str = System.console().readLine();
		y3 = Integer.parseInt(str);
		System.out.print("Please enter the new values for the row (as a list of integers separated by commas): ");
		newRow = System.console().readLine();
		myMatrix.setRow(y3-1,newRow);
		break;
	case 4:
		System.out.print("Which column of the array is to be modified? ");
		str = System.console().readLine();
		x4 = Integer.parseInt(str);
		System.out.print("Please enter the new values for the column (as a list of integers separated by commas): ");
		newColumn = System.console().readLine();
		myMatrix.setRow(x4-1,newColumn);
		break;
	case 5:
		System.out.println(myMatrix.toString());
		break;
	case 6:
		myMatrix.prettyPrint();
		break;
	case 0:
		System.out.print("Please enter the new values for the matrix (as a list of integers separated by commas and semicolons): ");
		newMatrix = System.console().readLine();
		myMatrix.setMatrix(newMatrix);
		break;
	case 7:
		myMatrix.symmetryCheck();
		break;
	case 8:
		myMatrix.triangularCheck();
		break;
	case 9:
		System.out.println("Bye!");
		exitcmd=true;
	}
}
