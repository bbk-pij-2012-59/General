//Ex3x4 - Mortgage payments

double annualPayment = 0, interestRate = 0, totalBorrowed = 0, totalPayment = 0, totalYears = 0, yearsForInterest = 0
int annualPaymentR = 0, totalPaymentR = 0, yearsForInterestR = 0
String str = ""

double getTotalCost1(double borrowed1, double rate, double years1)
{
	double totalCost = (1 + (rate / 100))*borrowed1
	return totalCost
}

double getTotalCost2(double borrowed1, double rate, double years1)
{
	double totalCost = (1 + (years1 * rate / 100))*borrowed1
	return totalCost
}


double getAnnualPayment(double totalcost1, double years2)
{
	double annualPayment = totalcost1 / years2
	return annualPayment
}

double getYearsBeforeInterestPaid(double annualcost, double borrowed2, double totalcost2)
{
	double yearsToPayOffInterest = (totalcost2 - borrowed2) / annualcost
	return yearsToPayOffInterest
}

//Main program starts here
//First get your data
print "Please input the total amount borrowed (in GBP) on your mortgage: "
str = System.console().readLine()
totalBorrowed = Double.parseDouble(str)
print "Please input the length (in years) of your mortgage: "
str = System.console().readLine()
totalYears = Double.parseDouble(str)
print "Please input the interest rate (as a percentage) for your mortgage: "
str = System.console().readLine()
interestRate = Double.parseDouble(str)
//Then process your data
totalPayment = getTotalCost1(totalBorrowed, interestRate, totalYears)
annualPayment = getAnnualPayment(totalPayment, totalYears)
yearsForInterest = getYearsBeforeInterestPaid(annualPayment, totalBorrowed, totalPayment)
totalPaymentR = getTotalCost2(totalBorrowed, interestRate, totalYears)
annualPaymentR = getAnnualPayment(totalPaymentR, totalYears)
yearsForInterestR = 1 + getYearsBeforeInterestPaid(annualPaymentR, totalBorrowed, totalPaymentR)
//Then print out the results
println "According to the formula given;"
println "Your total payments will be " + totalPayment + " GBP."
println "Your annual payments will be " + annualPayment + " GBP."
println "After " + yearsForInterest + " years, the interest will have been paid and only the initial capital will remain."
println "According to RW's modified formula;"
println "Your total payments will be " + totalPaymentR + " GBP."
println "Your annual payments will be " + annualPaymentR + " GBP."
println "After " + yearsForInterestR + " years, the interest will have been paid and only the initial capital will remain."





