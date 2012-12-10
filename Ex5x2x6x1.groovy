String str;
String[] employeeArray;
employeeArray = new String[10];
int[] staffIDarray;
staffIDarray = new int[10]

for (int i1 = 0; i1<=9; i1++)
{
	print "Enter the name of employee number " + (i1+1) + ":";
	employeeArray[i1] = System.console().readLine();
	print "Enter the ID number of the employee number " + (i1+1) + ":"
	str = System.console().readLine();
	staffIDarray[i1]= Integer.parseInt(str);
}

println "List of IDs less than 1000 with corresponding names"
for (int i2 = 0; i2<=9; i2++)
{
	if (staffIDarray[i2] < 1000)
	{
		println employeeArray[i2] + ", " + staffIDarray[i2];
	}
}
	
println "List of employee names starting with J or S with corresponding IDs";
for (int i3 = 0; i3<=9; i3++)
{
	if (employeeArray[i3].charAt(0) == 'J' || employeeArray[i3].charAt(0) == 'S')
	{
		println employeeArray[i3] + ", " + staffIDarray[i3];
	}
}
	