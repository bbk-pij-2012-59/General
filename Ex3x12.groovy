//Ex3x12

double atob = 0, btoc = 0, ctoa = 0
String str = ""
class Point
{
double x;
double y;
}
Point pointA = new Point()
Point pointB = new Point()
Point pointC = new Point()
print "Please input the X coordinate of your first point: "
str = System.console().readLine()
pointA.x = Double.parseDouble(str)
print "Please input the Y coordinate of your first point: "
str = System.console().readLine()
pointA.y = Double.parseDouble(str)
print "Please input the X coordinate of your second point: "
str = System.console().readLine()
pointB.x = Double.parseDouble(str)
print "Please input the Y coordinate of your second point: "
str = System.console().readLine()
pointB.y = Double.parseDouble(str)
print "Please input the X coordinate of your third point: "
str = System.console().readLine()
pointC.x = Double.parseDouble(str)
print "Please input the Y coordinate of your third point: "
str = System.console().readLine()
pointC.y = Double.parseDouble(str)
println "Your points are at:"
println "Point A: " + pointA.x + ", " + pointA.y
println "Point B: " + pointB.x + ", " + pointB.y
println "Point C: " + pointC.x + ", " + pointC.y
//Calculate the squares of the distances between the pairs of points
atob = ((pointB.x-pointA.x)*(pointB.x-pointA.x)) + ((pointB.y-pointA.y)*(pointB.y-pointA.y))
btoc = ((pointC.x-pointB.x)*(pointC.x-pointB.x)) + ((pointC.y-pointB.y)*(pointC.y-pointB.y))
ctoa = ((pointA.x-pointC.x)*(pointA.x-pointC.x)) + ((pointA.y-pointC.y)*(pointA.y-pointC.y))
println "The squares of the distances between points are:"
println "A to B: " + atob
println "B to C: " + btoc
println "C to A: " + ctoa
//Calculate the distances between the pairs of points
atob = Math.sqrt(atob)
btoc = Math.sqrt(btoc)
ctoa = Math.sqrt(ctoa)
println "The distances between points are:"
println "A to B: " + atob
println "B to C: " + btoc
println "C to A: " + ctoa
//Check which distance is shortest
if (atob < btoc && atob < ctoa)
{
	print "A and B are the closest"
}
else if (btoc < atob && btoc < ctoa)
{
	print "B and C are the closest"
}
else if (ctoa < atob && ctoa < btoc)
{
	print "C and A are the closest"
}
else
{
	println "There appears to be a problem; either two of the distances between pairs of points are the same or two of your points are coincident"
}
