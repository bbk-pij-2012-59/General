//Ex4x6 - appears to work, but doesn't have a menu



class Point
{
	double x
	double y


	double distanceTo(Point otherpoint)
	//calculates the distance to another point
	{
		return Math.sqrt(((otherpoint.x - this.x) * (otherpoint.x - this.x)) + ((otherpoint.y - this.y) * (otherpoint.y - this.y)))	
	}

	double distanceToOrigin()
	//calculates the distance to the origin, implemented by calling the first method
	{
		Point zeroPoint = new Point()
		zeroPoint.x = 0.0
		zeroPoint.y = 0.0
		return distanceTo(zeroPoint)
	}

	void moveTo(double xx, double yy)
	//changes the coordinates of this point to be the given parameters x and y
	{
		this.x = xx
		this.y = yy
	}


	void moveTo(Point newPos)
	//changes the coordinates of this point to move where the given point is
	{
		this.x = newPos.x
		this.y = newPos.y	
	}	

	Point clone()
	//returns a copy of the current point with the same coordinates
	{
		Point copy1 = new Point()
		copy1.x = this.x
		copy1.y = this.y
		return copy1	
	}


	Point opposite()
	//returns a copy of the current point with the coordinates multiplied by -1
	{
		Point copy2 = new Point()
		copy2.x = -this.x
		copy2.y = -this.y
		return copy2
	}
}

Point point1 = new Point()
Point point2 = new Point()
Point point3 = new Point()
Point point4 = new Point()
Point point5 = new Point()
double distance1 = 0, distance2 = 0, x1 = 0, y1 = 0
String str = ""

print "Please enter the X coordinate of your point: "
str = System.console().readLine()
point1.x = Double.parseDouble(str)
print "Please enter the Y coordinate of your point: "
str = System.console().readLine()
point1.y = Double.parseDouble(str)
println "Your point is at " + point1.x + ", " +point1.y

println "Let's calculate the distance of your point to another point"
print "Please enter the X coordinate of another point: "
str = System.console().readLine()
point2.x = Double.parseDouble(str)
print "Please enter the Y coordinate of another point: "
str = System.console().readLine()
point2.y = Double.parseDouble(str)
distance1 = point1.distanceTo(point2)
println "The distance from your point to the point at " + point2.x + ", " + point2.y + " is " + distance1

println "Let's calculate the distance of your point to the origin"
distance2 = point1.distanceToOrigin()
println "The distance from your point to the origin is " + distance2

println "Let's move your point"
print "Please enter the X coordinate of where you want to move your point: "
str = System.console().readLine()
x1 = Double.parseDouble(str)
print "Please enter the Y coordinate of where you want to move your point: "
str = System.console().readLine()
y1 = Double.parseDouble(str)
point1.moveTo(x1,y1)
println "Your point is now at " + point1.x + ", " +point1.y

println "Let's move your point again"
print "Please enter the X coordinate of the new position of your point: "
str = System.console().readLine()
point3.x = Double.parseDouble(str)
print "Please enter the Y coordinate of the new position of your point: "
str = System.console().readLine()
point3.y = Double.parseDouble(str)
point1.moveTo(point3)
println "Your point is now at " + point1.x + ", " +point1.y

println "Let's make a copy of your point"
point4 = point1.clone()
println "Now, a copy of your point is at " + point4.x + ", " +point4.y

println "Let's make a mirror image of your point"
point5 = point1.opposite()
println "Now, a mirror image of your point is at " + point5.x + ", " +point5.y

//println "final positions of points: "
//println "First point: " + point1.x + ", " + point1.y
//println "Second point: " + point2.x + ", " + point2.y
//println "Third point: " + point3.x + ", " + point3.y
//println "Fourth point: " + point4.x + ", " + point4.y
//println "Fifth point: " + point5.x + ", " + point5.y
