//Ex3x13 - not working - NULLPointerException: cannot set property 'x' on null object at line 22

double xside = 0, yside = 0, perimeter = 0, area = 0, xx=0
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

Rectangle quadA = new Rectangle()

print "Please input the X coordinate of the upper left corner of your rectangle: "
str = System.console().readLine()
quadA.upLeft.x = Double.parseDouble(str)
print "Please input the Y coordinate of the upper left corner of your rectangle: "
str = System.console().readLine()
quadA.upLeft.y = Double.parseDouble(str)
print "Please input the X coordinate of the lower right corner of your rectangle: "
str = System.console().readLine()
quadA.downRight.x = Double.parseDouble(str)
print "Please input the Y coordinate of the lower right corner of your rectangle: "
str = System.console().readLine()
quadA.downRight.y = Double.parseDouble(str)
println "The corners of your rectangle are at:"
println "Upper left: " + quadA.upLeft.x + ", " + quadA.upLeft.y
println "Lower right: " + quadA.downRight.x + ", " + quadA.downRight.y
//Calculate the lengths of the sides of the rectangle, then the perimeter, then the area
xside = quadA.downRight.x - quadA.upLeft.x
yside = quadA.upLeft.y - quadA.downRight.y
perimeter = 2*(xside + yside)
area = xside * yside
println "The perimeter of your rectangle measures: " + perimeter
println "The area of your rectangle is: " + area

