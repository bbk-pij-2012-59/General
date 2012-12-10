double cost = 0, paid = 0, changeD = 0, changeAllInPenceD=0
int note50=0, note20=0, note10=0, note5=0, coin2=0, coin1=0, pence50=0, pence20=0, pence10=0, pence5=0, pence2=0, pence1=0
int changepoundsI=0, changepenceI=0, strlen=0, changeAllInPenceI=0
String str="", changeS="", changepenceS=""
print "How much does the purchase cost (in pounds)? "
str = System.console().readLine()
cost = Double.parseDouble(str)
print "How much has the customer proffered (in pounds)? "
str = System.console().readLine()
paid = Double.parseDouble(str)
changeD = paid - cost
changeAllInPenceD=changeD*100
changeAllInPenceI=changeAllInPenceD
//Using Subtraction Method
while (changeAllInPenceI >= 5000)
{
	changeAllInPenceI = changeAllInPenceI - 5000
	note50=note50+1
}
while (changeAllInPenceI >= 2000)
{
	changeAllInPenceI = changeAllInPenceI - 2000
	note20=note20+1
}
while (changeAllInPenceI >= 1000)
{
	changeAllInPenceI = changeAllInPenceI - 1000
	note10=note10+1
}
while (changeAllInPenceI >= 500)
{
	changeAllInPenceI = changeAllInPenceI - 500
	note5=note5+1
}
while (changeAllInPenceI >= 200)
{
	changeAllInPenceI = changeAllInPenceI - 200
	coin2=coin2+1
}
while (changeAllInPenceI >= 100)
{
	changeAllInPenceI = changeAllInPenceI - 100
	coin1=coin1+1
}
while (changeAllInPenceI >= 50)
{
	changeAllInPenceI = changeAllInPenceI - 50
	pence50=pence50+1
}
while (changeAllInPenceI >= 20)
{
	changeAllInPenceI = changeAllInPenceI - 20
	pence20=pence20+1
}
while (changeAllInPenceI >= 10)
{
	changeAllInPenceI = changeAllInPenceI - 10
	pence10=pence10+1
}
while (changeAllInPenceI >= 5)
{
	changeAllInPenceI = changeAllInPenceI - 5
	pence5=pence5+1
}
while (changeAllInPenceI >= 2)
{
	changeAllInPenceI = changeAllInPenceI - 2
	pence2=pence2+1
}
while (changeAllInPenceI >= 1)
{
	changeAllInPenceI = changeAllInPenceI - 1
	pence1=pence1+1
}
println "The change required is " + changeD + " pounds consisting of:"
if (note50>0)
{
	println note50 + " times 50 pound note(s)"
}
if (note20>0)
{
	println note20 + " times 20 pound note(s)"
}
if (note10>0)
{
	println note10 + " times 10 pound note"
}
if (note5>0)
{
	println note5 + " times 5 pound note"
}
if (coin2>0)
{
	println coin2 + " times 2 pound coin(s)"
}
if (coin1>0)
{
	println coin1 + " times 1 pound coin"
}
if (pence50>0)
{
	println pence50 + " times 50p coin"
}
if (pence20>0)
{
	println pence20 + " times 20p coin(s)"
}
if (pence10>0)
{
	println pence10 + " times 10p coin"
}
if (pence5>0)
{
	println pence5 + " times 5p coin"
}
if (pence2>0)
{
	println pence2 + " times 2p coin(s)"
}
if (pence1>0)
{
	println pence1 + " times 1p coin"
}





