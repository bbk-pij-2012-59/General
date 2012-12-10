//Ex3x15
boolean inquadC = false, inquadD = false
String str = ""
class Point
{
double x;
double y;
}
class Rectangle
{
Point upLeft;
Point downRight;
}
Point pointE = new Point()
Rectangle quadC = new Rectangle()
Rectangle quadD = new Rectangle()
print "Please input the X coordinate of the upper left corner of your first rectangle: "
str = System.console().readLine()
quadC.upLeft.x = Double.parseDouble(str)
print "Please input the Y coordinate of the upper left corner of your first rectangle: "
str = System.console().readLine()
quadC.upLeft.y = Double.parseDouble(str)
print "Please input the X coordinate of the lower right corner of your second rectangle: "
str = System.console().readLine()
quadD.downRight.x = Double.parseDouble(str)
print "Please input the Y coordinate of the lower right corner of your second rectangle: "
str = System.console().readLine()
quadD.downRight.y = Double.parseDouble(str)
print "Please input the X coordinate of your point: "
str = System.console().readLine()
pointE.x = Double.parseDouble(str)
print "Please input the Y coordinate of your point: "
str = System.console().readLine()
pointE.y = Double.parseDouble(str)
println "The corners of your rectangles are at:"
print "First rectangle: Upper left: " + quadC.upLeft.x + ", " + quadC.upLeft.y
println " Lower right: " + quadC.downRight.x + ", " + quadC.downRight.y
print "Second rectangle: Upper left: " + quadD.upLeft.x + ", " + quadD.upLeft.y
println " Lower right: " + quadD.downRight.x + ", " + quadD.downRight.y
println "Your point is at: " + pointE.x + ", " + pointE.y
if (pointE.x > quadC.upLeft.x && pointE.x < quadC.downRight.x && pointE.y > quadC.downRight.y && pointE.y < quadC.upLeft.y)
{
	inquadC = true
}
if (pointE.x > quadD.upLeft.x && pointE.x < quadD.downRight.x && pointE.y > quadD.downRight.y && pointE.y < quadD.upLeft.y)
{
	inquadD = true
}
if (inquadC)
{
	if (inquadD)
	{
		print "Your point is inside both of your rectangles"
	}
	else
	{
		print "Your point is inside the first of your rectangles"
	}
}
else if (inquadD)
{
	print "Your point is inside the second of your rectangles"
}
else
{
	print "Your point is outside both your rectangles"
}
