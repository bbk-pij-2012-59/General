boolean suit1acceptable = false, suit2acceptable = false, suit3acceptable = false, suit4acceptable = false, suit5acceptable = false
boolean rank1acceptable = false, rank2acceptable = false, rank3acceptable = false, rank4acceptable = false, rank5acceptable = false
boolean samesuit=false, foursuit=false, cardsconsecutive=true, fourrank=false, threerank=false, pair=false, twopair=false, royalstraight=false
int clubscount=0, diamondscount=0, heartscount=0, spadescount=0, acecount=0, twocount=0, threecount=0, fourcount=0, fivecount=0
int sixcount=0, sevencount=0, eightcount=0, ninecount=0, tencount=0, jackcount=0, queencount=0, kingcount=0
int temp1=0, temp2=0, temp3=0, temp4=0, temp5=0, value1=0, value2=0, value3=0, value4=0, value5=0
int sortrank1=0, sortrank2=0, sortrank3=0, sortrank4=0, sortrank5=0, lenrank1=0, lenrank2=0, lenrank3=0, lenrank4=0, lenrank5=0
int x1=0, x2=0, x3=0, x4=0, x5=0
String suit1="", suit2="", suit3="", suit4="", suit5="", r1="", r2="", r3="", r4="", r5="", rank1="", rank2="", rank3="", rank4="", rank5=""
String card1="", card2="", card3="", card4="", card5="", s1="", s2="", s3="", s4="", s5=""

//need to read in five cards
while (!suit1acceptable)
{
 	print "What is the suit of your first card? "
 	s1 = System.console().readLine()
 	print s1.substring(0,1)
 	if (s1.substring(0,1) == "c" || s1.substring(0,1) == "C")
 	{
  		suit1acceptable = true
  		suit1="Clubs"
  		clubscount=clubscount+1
 	}
 	else if (s1.substring(0,1) == "d" || s1.substring(0,1) == "D")
 	{
  		suit1acceptable = true
  		suit1="Diamonds"
  		diamondscount=diamondscount+1 
	}
 	else if (s1.substring(0,1) == "h" || s1.substring(0,1) == "H")
 	{
  		suit1acceptable = true
  		suit1="Hearts"
  		heartscount=heartscount+1 
	}
 	else if (s1.substring(0,1) == "s" || s1.substring(0,1) == "S")
 	{
  		suit1acceptable = true
  		suit1="Spades"
  		spadescount=spadescount+1
 	}
}
while (!rank1acceptable)
{
 	print "what is the rank of your first card? "
 	r1 = System.console().readLine()
 	lenrank1 = r1.length()
 	if (lenrank1 == 1)
 	{
  		rank1 = r1.substring(0,1)
 	}
 	else
 	{
  	rank1 = r1.substring(0,2)
 	}
 	if (rank1 == "1" || rank1 =="A" || rank1 == "a" || rank1 == "AC" || rank1 == "Ac" || rank1 == "aC" || rank1 == "ac")
 	{
  		value1=1
  		card1="Ace"
  		acecount=acecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "2" || rank1 == "TW" || rank1 == "Tw" || rank1 == "tW" || rank1 == "tw")
 	{
  		value1=2
  		card1="Two"
  		twocount=twocount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "3" || rank1 == "TH" || rank1 == "Th" || rank1 == "tH" || rank1 == "th")
 	{
  		value1=3
  		card1="Three"
  		threecount=threecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "4" || rank1 == "FO" || rank1 == "Fo" || rank1 == "fO" || rank1 == "fo")
 	{
  		value1=4
  		card1="Four"
  		fourcount=fourcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "5" || rank1 == "FI" || rank1 == "Fi" || rank1 == "fI" || rank1 == "fi")
 	{
  		value1=5
  		card1="Five"
  		fivecount=fivecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "6" || rank1 == "SI" || rank1 == "Si" || rank1 == "sI" || rank1 == "si")
 	{
  		value1=6
  		card1="Six"
  		sixcount=sixcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "7" || rank1 == "SE" || rank1 == "Se" || rank1 == "sE" || rank1 == "se")
 	{
  		value1=7
  		card1="Seven"
  		sevencount=sevencount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "8" || rank1 == "E" || rank1 == "e" || rank1 == "EI" || rank1 == "Ei" || rank1 == "eI" || rank1 == "ei")
 	{
  		value1=8
  		card1="Eight"
  		eightcount=eightcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "9" || rank1 == "N" || rank1 == "n" || rank1 == "NI" || rank1 == "Ni" || rank1 == "nI" || rank1 == "ni")
 	{
  		value1=9
  		card1="Nine"
  		ninecount=ninecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "10" || rank1 == "TE" || rank1 == "Te" || rank1 == "tE" || rank1 == "te")
 	{
  		value1=10
  		card1="Ten"
  		tencount=tencount+1
  		rank1acceptable = true
 	}
 	else if (rank1 =="J" || rank1 == "j" || rank1 == "JA" || rank1 == "Ja" || rank1 == "jA" || rank1 == "ja")
 	{
  		value1=11
  		card1="Jack"
  		jackcount=jackcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 =="Q" || rank1 == "q" || rank1 == "QU" || rank1 == "Qu" || rank1 == "qU" || rank1 == "qu")
 	{
  		value1=12
  		card1="Queen"
  		queencount=queencount+1
  		rank1acceptable = true
 	}
  	else if (rank1 =="K" || rank1 == "k" || rank1 == "KI" || rank1 == "Ki" || rank1 == "kI" || rank1 == "ki")
 	{
  		value1=13
  		card1="King"
  		kingcount=kingcount+1
  		rank1acceptable = true
 	}
}
println "Your first card is the " + card1 + " of " + suit1
 
while (!suit2acceptable)
{
 	print "What is the suit of your second card? "
 	s2 = System.console().readLine()
 	if (s2.substring(0,1) == "c" || s2.substring(0,1) == "C")
 	{
  		suit2acceptable = true
  		suit2="Clubs"
  		clubscount=clubscount+1
 	}
 	else if (s2.substring(0,1) == "d" || s2.substring(0,1) == "D")
 	{
  		suit2acceptable = true
  		suit2="Diamonds"
  		diamondscount=diamondscount+1 
	}
 	else if (s2.substring(0,1) == "h" || s2.substring(0,1) == "H")
 	{
  		suit2acceptable = true
  		suit2="Hearts"
  		heartscount=heartscount+1 
	}
 	else if (s2.substring(0,1) == "s" || s2.substring(0,1) == "S")
 	{
  		suit2acceptable = true
  		suit2="Spades"
  		spadescount=spadescount+1
 	}
}
while (!rank2acceptable)
{
 	print "what is the rank of your second card? "
 	r2 = System.console().readLine()
 	lenrank2 = r2.length()
 	if (lenrank2 == 1)
 	{
  		rank2 = r2.substring(0,1)
 	}
 	else
 	{
  		rank2 = r2.substring(0,2)
 	}
 	if (rank2 == "1" || rank2 =="A" || rank2 == "a" || rank2 == "AC" || rank2 == "Ac" || rank2 == "aC" || rank2 == "ac")
 	{
  		value2=1
  		card2="Ace"
  		acecount=acecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "2" || rank2 == "TW" || rank2 == "Tw" || rank2 == "tW" || rank2 == "tw")
 	{
  		value2=2
  		card2="Two"
  		twocount=twocount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "3" || rank2 == "TH" || rank2 == "Th" || rank2 == "tH" || rank2 == "th")
 	{
  		value2=3
  		card2="Three"
  		threecount=threecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "4" || rank2 == "FO" || rank2 == "Fo" || rank2 == "fO" || rank2 == "fo")
 	{
  		value2=4
  		card2="Four"
  		fourcount=fourcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "5" || rank2 == "FI" || rank2 == "Fi" || rank2 == "fI" || rank2 == "fi")
 	{
  		value2=5
  		card2="Five"
  		fivecount=fivecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "6" || rank2 == "SI" || rank2 == "Si" || rank2 == "sI" || rank2 == "si")
 	{
  		value2=6
  		card2="Six"
  		sixcount=sixcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "7" || rank2 == "SE" || rank2 == "Se" || rank2 == "sE" || rank2 == "se")
 	{
 		 value2=7
 		 card2="Seven"
 		 sevencount=sevencount+1
 		 rank2acceptable = true
 	}
 	else if (rank2 == "8" || rank2 == "EI" || rank2 == "Ei" || rank2 == "eI" || rank2 == "ei")
 	{
 		 value2=8
 		 card2="Eight"
 		 eightcount=eightcount+1
		  rank2acceptable = true
 	}
	 else if (rank2 == "9" || rank2 == "NI" || rank2 == "Ni" || rank2 == "nI" || rank2 == "ni")
 	{
  		value2=9
 		card2="Nine"
		ninecount=ninecount+1
		rank2acceptable = true
 	}
 	else if (rank2 == "10" || rank2 == "TE" || rank2 == "Te" || rank2 == "tE" || rank2 == "te")
 	{
  		value2=10
  		card2="Ten"
  		tencount=tencount+1
  		rank2acceptable = true
 	}
 	else if (rank2 =="J" || rank2 == "j" || rank2 == "JA" || rank2 == "Ja" || rank2 == "jA" || rank2 == "ja")
 	{
  		value2=11
  		card2="Jack"
  		jackcount=jackcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 =="Q" || rank2 == "q" || rank2 == "QU" || rank2 == "Qu" || rank2 == "qU" || rank2 == "qu")
 	{
  		value2=12
  		card2="Queen"
  		queencount=queencount+1
  		rank2acceptable = true
 	}
 
 	else if (rank2 =="K" || rank2 == "k" || rank2 == "KI" || rank2 == "Ki" || rank2 == "kI" || rank2 == "ki")
 	{
  		value2=13
  		card2="King"
  		kingcount=kingcount+1
  		rank2acceptable = true
 	}
}
println "Your second card is the " + card2 + " of " + suit2
 
while (!suit3acceptable)
{
 	print "What is the suit of your third card? "
 	s3 = System.console().readLine()
 	if (s3.substring(0,1) == "c" || s3.substring(0,1) == "C")
 	{
  		suit3acceptable = true
  		suit3="Clubs"
  		clubscount=clubscount+1
 	}
 	else if (s3.substring(0,1) == "d" || s3.substring(0,1) == "D")
 	{
  		suit3acceptable = true
  		suit3="Diamonds"
  		diamondscount=diamondscount+1 
	}
 	else if (s3.substring(0,1) == "h" || s3.substring(0,1) == "H")
 	{
  		suit3acceptable = true
  		suit3="Hearts"
  		heartscount=heartscount+1 
	}
 	else if (s3.substring(0,1) == "s" || s3.substring(0,1) == "S")
 	{
  		suit3acceptable = true
  		suit3="Spades"
  		spadescount=spadescount+1
 	}
}
while (!rank3acceptable)
{
 	print "what is the rank of your third card? "
 	r3 = System.console().readLine()
 	lenrank3 = r3.length()
 	if (lenrank3 == 1)
 	{
  		rank3 = r3.substring(0,1)
 	}
 	else
 	{
  		rank3 = r3.substring(0,2)
 	}
 	if (rank3 == "1" || rank3 =="A" || rank3 == "a" || rank3 == "AC" || rank3 == "Ac" || rank3 == "aC" || rank3 == "ac")
 	{
  		value3=1
  		card3="Ace"
  		acecount=acecount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "2" || rank3 == "TW" || rank3 == "Tw" || rank3 == "tW" || rank3 == "tw")
 	{
  		value3=2
  		card3="Two"
  		twocount=twocount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "3" || rank3 == "TH" || rank3 == "Th" || rank3 == "tH" || rank3 == "th")
 	{
  		value3=3
  		card3="Three"
  		threecount=threecount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "4" || rank3 == "FO" || rank3 == "Fo" || rank3 == "fO" || rank3 == "fo")
 	{
  		value3=4
  		card3="Four"
  		fourcount=fourcount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "5" || rank3 == "FI" || rank3 == "Fi" || rank3 == "fI" || rank3 == "fi")
 	{
  		value3=5
  		card3="Five"
  		fivecount=fivecount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "6" || rank3 == "SI" || rank3 == "Si" || rank3 == "sI" || rank3 == "si")
 	{
  		value3=6
  		card3="Six"
  		sixcount=sixcount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "7" || rank3 == "SE" || rank3 == "Se" || rank3 == "sE" || rank3 == "se")
 	{
  		value3=7
  		card3="Seven"
  		sevencount=sevencount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "8" || rank3 == "EI" || rank3 == "Ei" || rank3 == "eI" || rank3 == "ei")
 	{
  		value3=8
  		card3="Eight"
  		eightcount=eightcount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "9" || rank3 == "NI" || rank3 == "Ni" || rank3 == "nI" || rank3 == "ni")
 	{
  		value3=9
  		card3="Nine"
  		ninecount=ninecount+1
  		rank3acceptable = true
 	}
 	else if (rank3 == "10" || rank3 == "TE" || rank3 == "Te" || rank3 == "tE" || rank3 == "te")
 	{
  		value3=10
  		card3="Ten"
  		tencount=tencount+1
  		rank3acceptable = true
 	}
 	else if (rank3 =="J" || rank3 == "j" || rank3 == "JA" || rank3 == "Ja" || rank3 == "jA" || rank3 == "ja")
 	{
  		value3=11
  		card3="Jack"
  		jackcount=jackcount+1
  		rank3acceptable = true
 	}
 	else if (rank3 =="Q" || rank3 == "q" || rank3 == "QU" || rank3 == "Qu" || rank3 == "qU" || rank3 == "qu")
 	{
  		value3=12
  		card3="Queen"
  		queencount=queencount+1
  		rank3acceptable = true
 	}
 
 	else if (rank3 =="K" || rank3 == "k" || rank3 == "KI" || rank3 == "Ki" || rank3 == "kI" || rank3 == "ki")
 	{
  		value3=13
  		card3="King"
  		kingcount=kingcount+1
  		rank3acceptable = true
 	}
}
println "Your third card is the " + card3 + " of " + suit3

while (!suit4acceptable)
{
 	print "What is the suit of your fourth card? "
 	s4 = System.console().readLine()
 	if (s4.substring(0,1) == "c" || s4.substring(0,1) == "C")
 	{
  		suit4acceptable = true
  		suit4="Clubs"
  		clubscount=clubscount+1
 	}
 	else if (s4.substring(0,1) == "d" || s4.substring(0,1) == "D")
 	{
  		suit4acceptable = true
  		suit4="Diamonds"
  		diamondscount=diamondscount+1 
	}
 	else if (s4.substring(0,1) == "h" || s4.substring(0,1) == "H")
 	{
  		suit4acceptable = true
  		suit4="Hearts"
  		heartscount=heartscount+1 
	}
 	else if (s4.substring(0,1) == "s" || s4.substring(0,1) == "S")
 	{
  		suit4acceptable = true
  		suit4="Spades"
  		spadescount=spadescount+1
 	}
}
while (!rank4acceptable)
{
 	print "what is the rank of your fourth card? "
 	r4 = System.console().readLine()
 	lenrank4 = r4.length()
 	if (lenrank4 == 1)
 	{
  		rank4 = r4.substring(0,1)
 	}
 	else
 	{
  		rank4 = r4.substring(0,2)
 	}
 	if (rank4 == "1" || rank4 =="A" || rank4 == "a" || rank4 == "AC" || rank4 == "Ac" || rank4 == "aC" || rank4 == "ac")
 	{
  		value4=1
  		card4="Ace"
  		acecount=acecount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "2" || rank4 == "TW" || rank4 == "Tw" || rank4 == "tW" || rank4 == "tw")
 	{
  		value4=2
  		card4="Two"
  		twocount=twocount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "3" || rank4 == "TH" || rank4 == "Th" || rank4 == "tH" || rank4 == "th")
 	{
  		value4=3
  		card4="Three"
  		threecount=threecount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "4" || rank4 == "FO" || rank4 == "Fo" || rank4 == "fO" || rank4 == "fo")
 	{
  		value4=4
  		card4="Four"
  		fourcount=fourcount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "5" || rank4 == "FI" || rank4 == "Fi" || rank4 == "fI" || rank4 == "fi")
 	{
  		value4=5
  		card4="Five"
  		fivecount=fivecount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "6" || rank4 == "SI" || rank4 == "Si" || rank4 == "sI" || rank4 == "si")
 	{
  		value4=6
  		card4="Six"
  		sixcount=sixcount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "7" || rank4 == "SE" || rank4 == "Se" || rank4 == "sE" || rank4 == "se")
 	{
  		value4=7
  		card4="Seven"
  		sevencount=sevencount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "8" || rank4 == "EI" || rank4 == "Ei" || rank4 == "eI" || rank4 == "ei")
 	{
  		value4=8
  		card4="Eight"
  		eightcount=eightcount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "9" || rank4 == "NI" || rank4 == "Ni" || rank4 == "nI" || rank4 == "ni")
 	{
  		value4=9
  		card4="Nine"
  		ninecount=ninecount+1
  		rank4acceptable = true
 	}
 	else if (rank4 == "10" || rank4 == "TE" || rank4 == "Te" || rank4 == "tE" || rank4 == "te")
 	{
  		value4=10
  		card4="Ten"
  		tencount=tencount+1
  		rank4acceptable = true
 	}
 	else if (rank4 =="J" || rank4 == "j" || rank4 == "JA" || rank4 == "Ja" || rank4 == "jA" || rank4 == "ja")
 	{
  		value4=11
  		card4="Jack"
  		jackcount=jackcount+1
  		rank4acceptable = true
 	}
 	else if (rank4 =="Q" || rank4 == "q" || rank4 == "QU" || rank4 == "Qu" || rank4 == "qU" || rank4 == "qu")
 	{
  		value4=12
  		card4="Queen"
  		queencount=queencount+1
  		rank4acceptable = true
 	}
  	else if (rank4 =="K" || rank4 == "k" || rank4 == "KI" || rank4 == "Ki" || rank4 == "kI" || rank4 == "ki")
 	{
  		value4=13
  		card4="King"
  		kingcount=kingcount+1
  		rank4acceptable = true
 	}
}
println "Your fourth card is the " + card4 + " of " + suit4

while (!suit5acceptable)
{
 	print "What is the suit of your fifth card? "
 	s5 = System.console().readLine()
 	if (s5.substring(0,1) == "c" || s5.substring(0,1) == "C")
 	{
  		suit5acceptable = true
  		suit5="Clubs"
  		clubscount=clubscount+1
 	}
 	else if (s5.substring(0,1) == "d" || s5.substring(0,1) == "D")
 	{
  		suit5acceptable = true
  		suit5="Diamonds"
  		diamondscount=diamondscount+1 
	}
 	else if (s5.substring(0,1) == "h" || s5.substring(0,1) == "H")
 	{
  		suit5acceptable = true
  		suit5="Hearts"
  		heartscount=heartscount+1 
	}
 	else if (s5.substring(0,1) == "s" || s5.substring(0,1) == "S")
 	{
  		suit5acceptable = true
  		suit5="Spades"
  		spadescount=spadescount+1
 	}
}
while (!rank5acceptable)
{
 	print "what is the rank of your fifth card? "
 	r5 = System.console().readLine()
 	lenrank5 = r5.length()
 	if (lenrank5 == 1)
 	{
  		rank5 = r5.substring(0,1)
 	}
 	else
 	{
  		rank5 = r5.substring(0,2)
 	}	
 	if (rank5 == "1" || rank5 =="A" || rank5 == "a" || rank5 == "AC" || rank5 == "Ac" || rank5 == "aC" || rank5 == "ac")
 	{
  		value5=1
  		card5="Ace"
  		acecount=acecount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "2" || rank5 == "TW" || rank5 == "Tw" || rank5 == "tW" || rank5 == "tw")
 	{
  		value5=2
  		card5="Two"
  		twocount=twocount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "3" || rank5 == "TH" || rank5 == "Th" || rank5 == "tH" || rank5 == "th")
 	{
  		value5=3
  		card5="Three"
  		threecount=threecount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "4" || rank5 == "FO" || rank5 == "Fo" || rank5 == "fO" || rank5 == "fo")
 	{
  		value5=4
  		card5="Four"
  		fourcount=fourcount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "5" || rank5 == "FI" || rank5 == "Fi" || rank5 == "fI" || rank5 == "fi")
 	{
  		value5=5
  		card5="Five"
  		fivecount=fivecount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "6" || rank5 == "SI" || rank5 == "Si" || rank5 == "sI" || rank5 == "si")
 	{
  		value5=6
  		card5="Six"
  		sixcount=sixcount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "7" || rank5 == "SE" || rank5 == "Se" || rank5 == "sE" || rank5 == "se")
 	{
  		value5=7
  		card5="Seven"
  		sevencount=sevencount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "8" || rank5 == "EI" || rank5 == "Ei" || rank5 == "eI" || rank5 == "ei")
 	{
  		value5=8
  		card5="Eight"
  		eightcount=eightcount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "9" || rank5 == "NI" || rank5 == "Ni" || rank5 == "nI" || rank5 == "ni")
 	{
  		value5=9
  		card5="Nine"
  		ninecount=ninecount+1
  		rank5acceptable = true
 	}
 	else if (rank5 == "10" || rank5 == "TE" || rank5 == "Te" || rank5 == "tE" || rank5 == "te")
 	{
  		value5=10
  		card5="Ten"
  		tencount=tencount+1
  		rank5acceptable = true
 	}
 	else if (rank5 =="J" || rank5 == "j" || rank5 == "JA" || rank5 == "Ja" || rank5 == "jA" || rank5 == "ja")
 	{
  		value5=11
  		card5="Jack"
  		jackcount=jackcount+1
  		rank5acceptable = true
 	}
 	else if (rank5 =="Q" || rank5 == "q" || rank5 == "QU" || rank5 == "Qu" || rank5 == "qU" || rank5 == "qu")
 	{
  		value5=12
  		card5="Queen"
  		queencount=queencount+1
  		rank5acceptable = true
 	}
  	else if (rank5 =="K" || rank5 == "k" || rank5 == "KI" || rank5 == "Ki" || rank5 == "kI" || rank5 == "ki")
 	{
  		value5=13
  		card5="King"
  		kingcount=kingcount+1
  		rank5acceptable = true
 	}
}
println "Your fifth card is the " + card5 + " of " + suit5
 
///Sort the cards
temp1=value1
temp2=value2
temp3=value3
temp4=value4
temp5=value5
sortrank1=temp1
x1=1
if (temp2<sortrank1)
{
 	sortrank1=temp2
 	x1=2
}
if (temp3<sortrank1)
{
 	sortrank1=temp3
 	x1=3
}
if (temp4<sortrank1)
{
 	sortrank1=temp4
 	x1=4
}
if (temp5<sortrank1)
{
 	sortrank1=temp5
 	x1=5
}
 
if (x1==1)
{
	temp1=20 //any number larger than 13 would do
}
else if (x1==2)
{
	temp2=20
}
else if (x1==3)
{
	temp3=20
}
else if (x1==4)
{
	temp4=20
}
else if (x1==5)
{
	temp5=20
}

sortrank2=temp1
x2=1
if (temp2<sortrank2)
{
 	sortrank2=temp2
 	x2=2
}
if (temp3<sortrank2)
{
 	sortrank2=temp3
 	x2=3
}
if (temp4<sortrank2)
{
 	sortrank2=temp4
 	x2=4
}
if (temp5<sortrank2)
{
 	sortrank2=temp5
 	x2=5
}
 
if (x2==1)
{
	temp1=20 //any number larger than 13 would do
}
else if (x2==2)
{
	temp2=20
}
else if (x2==3)
{
	temp3=20
}
else if (x2==4)
{
	temp4=20
}
else if (x2==5)
{
	temp5=20
}
 
sortrank3=temp1
x3=1
if (temp2<sortrank3)
{
 	sortrank3=temp2
 	x3=2
}
if (temp3<sortrank3)
{
 	sortrank3=temp3
 	x3=3
}
if (temp4<sortrank3)
{
 	sortrank3=temp4
 	x3=4
}
if (temp5<sortrank3)
{
 	sortrank3=temp5
 	x3=5
}
 
if (x3==1)
{
	temp1=20 //any number larger than 13 would do
}
else if (x3==2)
{
	temp2=20
}
else if (x3==3)
{
	temp3=20
}
else if (x3==4)
{
	temp4=20
}
else if (x3==5)
{
	temp5=20
}
 
sortrank4=temp1
x4=1
if (temp2<sortrank4)
{
 	sortrank4=temp2
 	x4=2
}
if (temp3<sortrank4)
{
 	sortrank4=temp3
 	x4=3
}
if (temp4<sortrank4)
{
 	sortrank4=temp4
 	x4=4
}
if (temp5<sortrank4)
{
 	sortrank4=temp5
 	x4=5
}
 
if (x4==1)
{
	temp1=20 //any number larger than 13 would do
}
else if (x4==2)
{
	temp2=20
}
else if (x4==3)
{
	temp3=20
}
else if (x4==4)
{
	temp4=20
}
else if (x4==5)
{
	temp5=20
}
 
sortrank5=temp1
x5=1
if (temp2<sortrank5)
{
 	sortrank5=temp2
 	x5=2
}
if (temp3<sortrank5)
{
 	sortrank5=temp3
 	x5=3
}
if (temp4<sortrank5)
{
 	sortrank5=temp4
 	x5=4
}
if (temp5<sortrank5)
{
 	sortrank5=temp5
 	x5=5
}
 
//if (x5==1)
//{
//	temp1=20 //any number larger than 13 would do
//}
//else if (x5==2)
//{
//	temp2=20
//}
//else if (x5==3)
//{
//	temp3=20
//}
//else if (x5==4)
//{
//	temp4=20
//}
//else if (x5==5)
//{
//	temp5=20
//}
 
// Check if the ranks are not consecutive
if (sortrank2 != (sortrank1 + 1) || sortrank3 != (sortrank2 + 1) || sortrank4 != (sortrank3 + 1) || sortrank5 != (sortrank4 + 1))
{
	cardsconsecutive=false
}
//What about a royal straight though?!
if (sortrank1 == 1)
{
	if ((sortrank1 + 13) == (sortrank5 + 1) && sortrank5 == (sortrank4 + 1) && sortrank4 == (sortrank3 + 1) && sortrank3 == (sortrank2 + 1))
	{
	cardsconsecutive=true
	royalstraight=true
	}
}
	
//Decide if the hand meets any of the criteria

//Are four or five of the cards from the same suit?
if (clubscount==5 || diamondscount==5 || heartscount==5 || spadescount==5)
{
	samesuit=true
}
else if (clubscount==4 || diamondscount==4 || heartscount==4 || spadescount==4)
{
	foursuit=true
}
 
//Are four, three or two of the cards of the same rank?
if (acecount==4 || twocount==4 || threecount==4 || fourcount==4 || fivecount==4 || sixcount==4 || sevencount==4 || eightcount==4 || ninecount==4 || tencount==4 || jackcount==4 || queencount==4 || kingcount==4)
{
	fourrank=true
}
else if (acecount==3 || twocount==3 || threecount==3 || fourcount==3 || fivecount==3 || sixcount==3 || sevencount==3 || eightcount==3 || ninecount==3 || tencount==3 || jackcount==3 || queencount==3 || kingcount==3)
{
	threerank=true
}
if (acecount==2 || twocount==2 || threecount==2 || fourcount==2 || fivecount==2 || sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2)
{
	pair=true
}

//Is there more than one pair?
if (pair && !threerank && !fourrank)
{
	if (acecount==2 && (twocount==2 || threecount==2 || fourcount==2 || fivecount==2 || sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (twocount==2 && (threecount==2 || fourcount==2 || fivecount==2 || sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (threecount==2 && (fourcount==2 || fivecount==2 || sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (fourcount==2 && (fivecount==2 || sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (fivecount==2 && (sixcount==2 || sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (sixcount==2 && (sevencount==2 || eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (sevencount==2 && (eightcount==2 || ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (eightcount==2 && (ninecount==2 || tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (ninecount==2 && (tencount==2 || jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (tencount==2 && (jackcount==2 || queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (jackcount==2 && (queencount==2 || kingcount==2))
	{
		twopair=true
	}
	if (queencount==2 && kingcount==2)
	{
		twopair=true
	}
}	

//Print out the outcome

if (samesuit && cardsconsecutive) 
{
	if (royalstraight)
	{
		println "Your hand is a Ace-High Straight Flush"//all cards share the same suit and their ranks run consecutively from ten to ace
	}
	else
	{
		println "Your hand is a Straight Flush"//all cards share the same suit and their ranks are consecutive
	}
}
else if (fourrank)
{
	println "Your hand contains a Poker" //four of the five cards have the same rank
}
else if (threerank && pair)
{
	println "Your hand is a Full House" //three of a kind plus a pair
}
else if (samesuit)
{
	println "Your hand is a Flush" //all cards share the same suit, but their ranks are not consecutive
}
else if (cardsconsecutive)
{
	if (royalstraight)
	{
		println "Your hand is a Ace-High Straight"//the cards do not share the same suit, but their ranks run consecutively from ten to ace
	}
	else
	{
		println "Your hand is a Straight"//the cards do not share the same suit, but all their ranks are consecutive
	}
}
else if (threerank)
{
	println "Your hand contains Three of a Kind" //three of the cards have the same rank
}
else if (twopair)
{
	println "Your hand contains Two Pairs" //two pairs
}
else if (pair)
{
	println "Your hand Contains One Pair" //two of the cards have the same rank
}
else
{
	println "Sorry your hand contains Nothing!"
}

