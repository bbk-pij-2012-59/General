//Ex5x2
ArrayCopier newcopy = new ArrayCopier();

int[] array1 = [1, 2, 3, 4, 5];
int[] array2 = [21, 22, 23, 24, 25];
int[] array3 = [31, 32, 33, 34, 35, 36, 37, 38, 39];

newcopy.copy(array1, array2);
System.out.print("After copying Array 1 to Array 2, Array 2 now contains: ");
for (i = 0; i <= (array2.length-1); i++)
{
	System.out.print(array2[i] + " ");
}
System.out.println("");

newcopy.copy(array2, array3);
System.out.print("After copying Array 2 to Array 3, Array 3 now contains: ");
for (i = 0; i <= (array3.length-1); i++)
{
	System.out.print(array3[i] + " ");
}
System.out.println("");

newcopy.copy(array3, array1);
System.out.print("After copying Array 3 to Array 1, Array 1 now contains: ");
for (i = 0; i <= (array1.length-1); i++)
{
	System.out.print(array1[i] + " ");
}
System.out.println("");