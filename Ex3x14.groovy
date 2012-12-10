//Ex3x14
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
Point pointD = new Point()
Rectangle quadB = new Rectangle()
print "Please input the X coordinate of the upper left corner of your rectangle: "
str = System.console().readLine()
quadB.upLeft.x = Double.parseDouble(str)
print "Please input the Y coordinate of the upper left corner of your rectangle: "
str = System.console().readLine()
quadB.upLeft.y = Double.parseDouble(str)
print "Please input the X coordinate of the lower right corner of your rectangle: "
str = System.console().readLine()
quadB.downRight.x = Double.parseDouble(str)
print "Please input the Y coordinate of the lower right corner of your rectangle: "
str = System.console().readLine()
quadB.downRight.y = Double.parseDouble(str)
print "Please input the X coordinate of your point: "
str = System.console().readLine()
pointD.x = Double.parseDouble(str)
print "Please input the Y coordinate of your point: "
str = System.console().readLine()
pointD.y = Double.parseDouble(str)
println "The corners of your rectangle are at:"
println "Upper left: " + quadB.upLeft.x + ", " + quadB.upLeft.y
println "Lower right: " + quadB.downRight.x + ", " + quadB.downRight.y
println "Your point is at: " + pointD.x + ", " + pointD.y
if (pointD.x > quadB.upLeft.x && pointD.x < quadB.downRight.x && pointD.y > quadB.downRight.y && pointD.y < quadB.upLeft.y)
{
	println "Your point is inside your rectangle"
}
else
{
	println "Your point is outside your rectangle"
}
