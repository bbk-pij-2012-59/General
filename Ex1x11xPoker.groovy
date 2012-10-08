boolean suit1acceptable = false
boolean suit2acceptable = false
boolean suit3acceptable = false
boolean suit4acceptable = false
boolean suit5acceptable = false
boolean rank1acceptable = false
boolean rank2acceptable = false
boolean rank3acceptable = false
boolean rank4acceptable = false
boolean rank5acceptable = false
boolean cardsconsecutive=false, samesuit=false, threerank=false, twopair=false, onepair=false
int clubscount=0, diamondscount=0, heartscount=0, spadescount=0
int acecount=0, twocount=0, threecount=0, fourcount=0, fivecount=0, sixcount=0, sevencount=0
int eightcount=0, ninecount=zero, tencount=0, jackcount=0, queencount=0, kingcount=0
int temp1=0, temp2=0, temp3=0, temp4=0, temp5=0
int sortrank1=0, sortrank2=0, sortrank3=0, sortrank4=0, sortrank5=0
//need to read in five cards
while (!suit1acceptable)
{
 	print "What is the suit of your first card? "
 	String suit1 = System.console().readLine()
 	if (suit1 == "clubs" || suit1 == "Clubs")
 	{
  		suit1acceptable = true
  		clubscount=clubscount+1
 	}
 	else if (suit1 == "diamonds" || suit1 == "Diamonds")
 	{
  		suit1acceptable = true
  		diamondscount=diamondscount+1 
	}
 	else if (suit1 == "hearts" || suit1 == "Hearts")
 	{
  		suit1acceptable = true
  		heartscount=heartscount+1 
	}
 	else if (suit1 == "spades" || suit1 == "Spades")
 	{
  		suit1acceptable = true
  		spadescount=spadescount+1
 	}
}
while (!rank1acceptable)
{
 	print "what is the rank of your first card? "
 	String r1 = System.console().readLine()
 	int lenrank1 = r1.length()
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
  		int value1=1
  		String card1="Ace"
  		acecount=acecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "2" || rank1 == "TW" || rank1 == "Tw" || rank1 == "tW" || rank1 == "tw")
 	{
  		int value1=2
  		String card1="Two"
  		twocount=twocount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "3" || rank1 == "TH" || rank1 == "Th" || rank1 == "tH" || rank1 == "th")
 	{
  		int value1=3
  		String card1="Three"
  		threecount=threecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "4" || rank1 == "FO" || rank1 == "Fo" || rank1 == "fO" || rank1 == "fo")
 	{
  		int value1=4
  		String card1="Four"
  		fourcount=fourcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "5" || rank1 == "FI" || rank1 == "Fi" || rank1 == "fI" || rank1 == "fi")
 	{
  		int value1=5
  		String card1="Five"
  		fivecount=fivecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "6" || rank1 == "SI" || rank1 == "Si" || rank1 == "sI" || rank1 == "si")
 	{
  		int value1=6
  		String card1="Six"
  		sixcount=sixcount+1
  		rank1acceptable = true
 	}
 		else if (rank1 == "7" || rank1 == "SE" || rank1 == "Se" || rank1 == "sE" || rank1 == "se")
 	{
  		int value1=7
  		String card1="Seven"
  		sevencount=sevencount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "8" || rank1 == "EI" || rank1 == "Ei" || rank1 == "eI" || rank1 == "ei")
 	{
  		int value1=8
  		String card1="Eight"
  		eightcount=eightcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "9" || rank1 == "NI" || rank1 == "Ni" || rank1 == "nI" || rank1 == "ni")
 	{
  		int value1=9
  		String card1="Nine"
  		ninecount=ninecount+1
  		rank1acceptable = true
 	}
 	else if (rank1 == "10" || rank1 == "TE" || rank1 == "Te" || rank1 == "tE" || rank1 == "te")
 	{
  		int value1=10
  		String card1="Ten"
  		tencount=tencount+1
  		rank1acceptable = true
 	}
 	else if (rank1 =="J" || rank1 == "j" || rank1 == "JA" || rank1 == "Ja" || rank1 == "jA" || rank1 == "ja")
 	{
  		int value1=11
  		String card1="Jack"
  		jackcount=jackcount+1
  		rank1acceptable = true
 	}
 	else if (rank1 =="Q" || rank1 == "q" || rank1 == "QU" || rank1 == "Qu" || rank1 == "qU" || rank1 == "qu")
 	{
  		int value1=12
  		String card1="Queen"
  		queencount=queencount+1
  		rank1acceptable = true
 	}
  	else if (rank1 =="K" || rank1 == "k" || rank1 == "KI" || rank1 == "Ki" || rank1 == "kI" || rank1 == "ki")
 	{
  		int value1=13
  		String card1="King"
  		kingcount=kingcount+1
  		rank1acceptable = true
 	}
}
println "Your first card is the " + card1 + " of " + suit1
 
while (!suit2acceptable)
{
 	print "What is the suit of your second card? "
 	String suit2 = System.console().readLine()
 	if (suit2 == "clubs" || suit2 == "Clubs")
 	{
  		suit2acceptable = true
  		clubscount=clubscount+1
 	}
 	else if (suit2 == "diamonds" || suit2 == "Diamonds")
 	{
  		suit2acceptable = true
  		diamondscount=diamondscount+1 
	}
 	else if (suit2 == "hearts" || suit2 == "Hearts")
 	{
  		suit2acceptable = true
  		heartscount=heartscount+1 
	}
 	else if (suit2 == "spades" || suit2 == "Spades")
 	{
  		suit2acceptable = true
  		spadescount=spadescount+1
 	}
}
while (!rank2acceptable)
{
 	print "what is the rank of your second card? "
 	String r2 = System.console().readLine()
 	int lenrank2 = r2.length()
 	if (lenrank2 == 1)
 	{
  		rank2 = r2.substring(0,1)
 	}
 	else
  		rank2 = r2.substring(0,2)
 	}
 	if (rank2 == "1" || rank2 =="A" || rank2 == "a" || rank2 == "AC" || rank2 == "Ac" || rank2 == "aC" || rank2 == "ac")
 	{
  		int value2=1
  		String card2="Ace"
  		acecount=acecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "2" || rank2 == "TW" || rank2 == "Tw" || rank2 == "tW" || rank2 == "tw")
 	{
  		int value2=2
  		String card2="Two"
  		twocount=twocount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "3" || rank2 == "TH" || rank2 == "Th" || rank2 == "tH" || rank2 == "th")
 	{
  		int value2=3
  		String card2="Three"
  		threecount=threecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "4" || rank2 == "FO" || rank2 == "Fo" || rank2 == "fO" || rank2 == "fo")
 	{
  		int value2=4
  		String card2="Four"
  		fourcount=fourcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "5" || rank2 == "FI" || rank2 == "Fi" || rank2 == "fI" || rank2 == "fi")
 	{
  		int value2=5
  		String card2="Five"
  		fivecount=fivecount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "6" || rank2 == "SI" || rank2 == "Si" || rank2 == "sI" || rank2 == "si")
 	{
  		int value2=6
  		String card2="Six"
  		sixcount=sixcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 == "7" || rank2 == "SE" || rank2 == "Se" || rank2 == "sE" || rank2 == "se")
 	{
 		 int value2=7
 		 String card2="Seven"
 		 sevencount=sevencount+1
 		 rank2acceptable = true
 	}
 	else if (rank2 == "8" || rank2 == "EI" || rank2 == "Ei" || rank2 == "eI" || rank2 == "ei")
 	{
 		 int value2=8
 		 String card2="Eight"
 		 eightcount=eightcount+1
		  rank2acceptable = true
 	}
	 else if (rank2 == "9" || rank2 == "NI" || rank2 == "Ni" || rank2 == "nI" || rank2 == "ni")
 	{
  		int value2=9
 		String card2="Nine"
		ninecount=ninecount+1
		rank2acceptable = true
 	}
 	else if (rank2 == "10" || rank2 == "TE" || rank2 == "Te" || rank2 == "tE" || rank2 == "te")
 	{
  		int value2=10
  		String card2="Ten"
  		tencount=tencount+1
  		rank2acceptable = true
 	}
 		else if (rank2 =="J" || rank2 == "j" || rank2 == "JA" || rank2 == "Ja" || rank2 == "jA" || rank2 == "ja")
 	{
  		int value2=11
  		String card2="Jack"
  		jackcount=jackcount+1
  		rank2acceptable = true
 	}
 	else if (rank2 =="Q" || rank2 == "q" || rank2 == "QU" || rank2 == "Qu" || rank2 == "qU" || rank2 == "qu")
 	{
  		int value2=12
  		String card2="Queen"
  		queencount=queencount+1
  		rank2acceptable = true
 	}
 
 	else if (rank2 =="K" || rank2 == "k" || rank2 == "KI" || rank2 == "Ki" || rank2 == "kI" || rank2 == "ki")
 	{
  		int value2=13
  		String card2="King"
  		kingcount=kingcount+1
  		rank2acceptable = true
 	}
}
println "Your second card is the " + card2 + " of " + suit2
 
while (!suit3acceptable)
{
 	print "What is the suit of your third card? "
 	String suit3 = System.console().readLine()
 	if (suit3 == "clubs" || suit3 == "Clubs")
 	{
  		suit3acceptable = true
  		clubscount=clubscount+1
 	}
 	else if (suit3 == "diamonds" || suit3 == "Diamonds")
 	{
  		suit3acceptable = true
  		diamondscount=diamondscount+1 
	}
 	else if (suit3 == "hearts" || suit3 == "Hearts")
 	{
  		suit3acceptable = true
  		heartscount=heartscount+1 
	}
 	else if (suit3 == "spades" || suit3 == "Spades")
 	{
  		suit3acceptable = true
  		spadescount=spadescount+1
 	}
}
while (!rank3acceptable)
{
 print "what is the rank of your third card? "
 String r3 = System.console().readLine()
 int lenrank3 = r3.length()
 if (lenrank3 == 1)
 {
  rank3 = r3.substring(0,1)
 }
 else
  rank3 = r3.substring(0,2)
 }
 if (rank3 == "1" || rank3 =="A" || rank3 == "a" || rank3 == "AC" || rank3 == "Ac" || rank3 == "aC" || rank3 == "ac")
 {
  int value3=1
  String card3="Ace"
  acecount=acecount+1
  rank3acceptable = true
 }
 else if (rank3 == "2" || rank3 == "TW" || rank3 == "Tw" || rank3 == "tW" || rank3 == "tw")
 {
  int value3=2
  String card3="Two"
  twocount=twocount+1
  rank3acceptable = true
 }
 else if (rank3 == "3" || rank3 == "TH" || rank3 == "Th" || rank3 == "tH" || rank3 == "th")
 {
  int value3=3
  String card3="Three"
  threecount=threecount+1
  rank3acceptable = true
 }
 else if (rank3 == "4" || rank3 == "FO" || rank3 == "Fo" || rank3 == "fO" || rank3 == "fo")
 {
  int value3=4
  String card3="Four"
  fourcount=fourcount+1
  rank3acceptable = true
 }
 else if (rank3 == "5" || rank3 == "FI" || rank3 == "Fi" || rank3 == "fI" || rank3 == "fi")
 {
  int value3=5
  String card3="Five"
  fivecount=fivecount+1
  rank3acceptable = true
 }
 else if (rank3 == "6" || rank3 == "SI" || rank3 == "Si" || rank3 == "sI" || rank3 == "si")
 {
  int value3=6
  String card3="Six"
  sixcount=sixcount+1
  rank3acceptable = true
 }
 else if (rank3 == "7" || rank3 == "SE" || rank3 == "Se" || rank3 == "sE" || rank3 == "se")
 {
  int value3=7
  String card3="Seven"
  sevencount=sevencount+1
  rank3acceptable = true
 }
 else if (rank3 == "8" || rank3 == "EI" || rank3 == "Ei" || rank3 == "eI" || rank3 == "ei")
 {
  int value3=8
  String card3="Eight"
  eightcount=eightcount+1
  rank3acceptable = true
 }
 else if (rank3 == "9" || rank3 == "NI" || rank3 == "Ni" || rank3 == "nI" || rank3 == "ni")
 {
  int value3=9
  String card3="Nine"
  ninecount=ninecount+1
  rank3acceptable = true
 }
 else if (rank3 == "10" || rank3 == "TE" || rank3 == "Te" || rank3 == "tE" || rank3 == "te")
 {
  int value3=10
  String card3="Ten"
  tencount=tencount+1
  rank3acceptable = true
 }
 else if (rank3 =="J" || rank3 == "j" || rank3 == "JA" || rank3 == "Ja" || rank3 == "jA" || rank3 == "ja")
 {
  int value3=11
  String card3="Jack"
  jackcount=jackcount+1
  rank3acceptable = true
 }
 else if (rank3 =="Q" || rank3 == "q" || rank3 == "QU" || rank3 == "Qu" || rank3 == "qU" || rank3 == "qu")
 {
  int value3=12
  String card3="Queen"
  queencount=queencount+1
  rank3acceptable = true
 }
 
 else if (rank3 =="K" || rank3 == "k" || rank3 == "KI" || rank3 == "Ki" || rank3 == "kI" || rank3 == "ki")
 {
  int value3=13
  String card3="King"
  kingcount=kingcount+1
  rank3acceptable = true
 }
}
println "Your third card is the " + card3 + " of " + suit3
while (!suit4acceptable)
{
 print "What is the suit of your fourth card? "
 String suit4 = System.console().readLine()
 if (suit4 == "clubs" || suit4 == "Clubs")
 {
  suit4acceptable = true
  clubscount=clubscount+1
 }
 else if (suit4 == "diamonds" || suit4 == "Diamonds")
 {
  suit4acceptable = true
  diamondscount=diamondscount+1 
}
 else if (suit4 == "hearts" || suit4 == "Hearts")
 {
  suit4acceptable = true
  heartscount=heartscount+1 
}
 else if (suit4 == "spades" || suit4 == "Spades")
 {
  suit4acceptable = true
  spadescount=spadescount+1
 }
}
while (!rank4acceptable)
{
 print "what is the rank of your third card? "
 String r4 = System.console().readLine()
 int lenrank4 = r4.length()
 if (lenrank4 == 1)
 {
  rank4 = r4.substring(0,1)
 }
 else
  rank4 = r4.substring(0,2)
 }
 if (rank4 == "1" || rank4 =="A" || rank4 == "a" || rank4 == "AC" || rank4 == "Ac" || rank4 == "aC" || rank4 == "ac")
 {
  int value4=1
  String card4="Ace"
  acecount=acecount+1
  rank4acceptable = true
 }
 else if (rank4 == "2" || rank4 == "TW" || rank4 == "Tw" || rank4 == "tW" || rank4 == "tw")
 {
  int value4=2
  String card4="Two"
  twocount=twocount+1
  rank4acceptable = true
 }
 else if (rank4 == "3" || rank4 == "TH" || rank4 == "Th" || rank4 == "tH" || rank4 == "th")
 {
  int value4=3
  String card4="Three"
  threecount=threecount+1
  rank4acceptable = true
 }
 else if (rank4 == "4" || rank4 == "FO" || rank4 == "Fo" || rank4 == "fO" || rank4 == "fo")
 {
  int value4=4
  String card4="Four"
  fourcount=fourcount+1
  rank4acceptable = true
 }
 else if (rank4 == "5" || rank4 == "FI" || rank4 == "Fi" || rank4 == "fI" || rank4 == "fi")
 {
  int value4=5
  String card4="Five"
  fivecount=fivecount+1
  rank4acceptable = true
 }
 else if (rank4 == "6" || rank4 == "SI" || rank4 == "Si" || rank4 == "sI" || rank4 == "si")
 {
  int value4=6
  String card4="Six"
  sixcount=sixcount+1
  rank4acceptable = true
 }
 else if (rank4 == "7" || rank4 == "SE" || rank4 == "Se" || rank4 == "sE" || rank4 == "se")
 {
  int value4=7
  String card4="Seven"
  sevencount=sevencount+1
  rank4acceptable = true
 }
 else if (rank4 == "8" || rank4 == "EI" || rank4 == "Ei" || rank4 == "eI" || rank4 == "ei")
 {
  int value4=8
  String card4="Eight"
  eightcount=eightcount+1
  rank4acceptable = true
 }
 else if (rank4 == "9" || rank4 == "NI" || rank4 == "Ni" || rank4 == "nI" || rank4 == "ni")
 {
  int value4=9
  String card4="Nine"
  ninecount=ninecount+1
  rank4acceptable = true
 }
 else if (rank4 == "10" || rank4 == "TE" || rank4 == "Te" || rank4 == "tE" || rank4 == "te")
 {
  int value4=10
  String card4="Ten"
  tencount=tencount+1
  rank4acceptable = true
 }
 else if (rank4 =="J" || rank4 == "j" || rank4 == "JA" || rank4 == "Ja" || rank4 == "jA" || rank4 == "ja")
 {
  int value4=11
  String card4="Jack"
  jackcount=jackcount+1
  rank4acceptable = true
 }
 else if (rank4 =="Q" || rank4 == "q" || rank4 == "QU" || rank4 == "Qu" || rank4 == "qU" || rank4 == "qu")
 {
  int value4=12
  String card4="Queen"
  queencount=queencount+1
  rank4acceptable = true
 }
 
 else if (rank4 =="K" || rank4 == "k" || rank4 == "KI" || rank4 == "Ki" || rank4 == "kI" || rank4 == "ki")
 {
  int value4=13
  String card4="King"
  kingcount=kingcount+1
  rank4acceptable = true
 }
}
println "Your fourth card is the " + card4 + " of " + suit4
while (!suit5acceptable)
{
 print "What is the suit of your fifth card? "
 String suit5 = System.console().readLine()
 if (suit5 == "clubs" || suit5 == "Clubs")
 {
  suit5acceptable = true
  clubscount=clubscount+1
 }
 else if (suit5 == "diamonds" || suit5 == "Diamonds")
 {
  suit5acceptable = true
  diamondscount=diamondscount+1 
}
 else if (suit5 == "hearts" || suit5 == "Hearts")
 {
  suit5acceptable = true
  heartscount=heartscount+1 
}
 else if (suit5 == "spades" || suit5 == "Spades")
 {
  suit5acceptable = true
  spadescount=spadescount+1
 }
}
while (!rank5acceptable)
{
 print "what is the rank of your fifth card? "
 String r5 = System.console().readLine()
 int lenrank5 = r5.length()
 if (lenrank5 == 1)
 {
  rank5 = r5.substring(0,1)
 }
 else
  rank5 = r5.substring(0,2)
 }
 if (rank5 == "1" || rank5 =="A" || rank5 == "a" || rank5 == "AC" || rank5 == "Ac" || rank5 == "aC" || rank5 == "ac")
 {
  int value5=1
  String card5="Ace"
  acecount=acecount+1
  rank5acceptable = true
 }
 else if (rank5 == "2" || rank5 == "TW" || rank5 == "Tw" || rank5 == "tW" || rank5 == "tw")
 {
  int value5=2
  String card5="Two"
  twocount=twocount+1
  rank5acceptable = true
 }
 else if (rank5 == "3" || rank5 == "TH" || rank5 == "Th" || rank5 == "tH" || rank5 == "th")
 {
  int value5=3
  String card5="Three"
  threecount=threecount+1
  rank5acceptable = true
 }
 else if (rank5 == "4" || rank5 == "FO" || rank5 == "Fo" || rank5 == "fO" || rank5 == "fo")
 {
  int value5=4
  String card5="Four"
  fourcount=fourcount+1
  rank5acceptable = true
 }
 else if (rank5 == "5" || rank5 == "FI" || rank5 == "Fi" || rank5 == "fI" || rank5 == "fi")
 {
  int value5=5
  String card5="Five"
  fivecount=fivecount+1
  rank5acceptable = true
 }
 else if (rank5 == "6" || rank5 == "SI" || rank5 == "Si" || rank5 == "sI" || rank5 == "si")
 {
  int value5=6
  String card5="Six"
  sixcount=sixcount+1
  rank5acceptable = true
 }
 else if (rank5 == "7" || rank5 == "SE" || rank5 == "Se" || rank5 == "sE" || rank5 == "se")
 {
  int value5=7
  String card5="Seven"
  sevencount=sevencount+1
  rank5acceptable = true
 }
 else if (rank5 == "8" || rank5 == "EI" || rank5 == "Ei" || rank5 == "eI" || rank5 == "ei")
 {
  int value5=8
  String card5="Eight"
  eightcount=eightcount+1
  rank5acceptable = true
 }
 else if (rank5 == "9" || rank5 == "NI" || rank5 == "Ni" || rank5 == "nI" || rank5 == "ni")
 {
  int value5=9
  String card5="Nine"
  ninecount=ninecount+1
  rank5acceptable = true
 }
 else if (rank5 == "10" || rank5 == "TE" || rank5 == "Te" || rank5 == "tE" || rank5 == "te")
 {
  int value5=10
  String card5="Ten"
  tencount=tencount+1
  rank5acceptable = true
 }
 else if (rank5 =="J" || rank5 == "j" || rank5 == "JA" || rank5 == "Ja" || rank5 == "jA" || rank5 == "ja")
 {
  int value5=11
  String card5="Jack"
  jackcount=jackcount+1
  rank5acceptable = true
 }
 else if (rank5 =="Q" || rank5 == "q" || rank5 == "QU" || rank5 == "Qu" || rank5 == "qU" || rank5 == "qu")
 {
  int value5=12
  String card5="Queen"
  queencount=queencount+1
  rank5acceptable = true
 }
 
 else if (rank5 =="K" || rank5 == "k" || rank5 == "KI" || rank5 == "Ki" || rank5 == "kI" || rank5 == "ki")
 {
  int value5=13
  String card5="King"
  kingcount=kingcount+1
  rank5acceptable = true
 }
}
println "Your fifth card is the " + card5 + " of " + suit5
 
//Sort the cards
temp1=value1
temp2=value2
temp3=value3
temp4=value4
temp5=value5
sortrank1=temp1
int x=1
if (temp2<sortrank1)
{
 sortrank1=temp2
 x=2
}
if (temp3<sortrank1)
{
 sortrank1=temp3
 x=3
}
if (temp4<sortrank1)
{
 sortrank1=temp4
 x=4
}
if (temp5<sortrank1)
{
 sortrank1=temp5
 x=5
}
 
if (x=1)
{
temp1=20 //any number larger than 13 would do
}
else if (x=2)
{
temp2=20
}
else if (x=3)
{
temp3=20
}
else if (x=4)
{
temp4=20
}
else if (x=5)
{
temp5=20
}
 
// Check if the ranks are consecutive
 
//Decide if the hand meets any of the criteria
 
if (samesuite && cardsconsecutive) 
{
	println "Your hand is a Straight Flush"//all cards share the same suit and their ranks are consecutive
}
else if (acecount==4 || twocount==4 || threecount==4 || fourcount==4 || fivecount==4 || sixcount==4 || sevencount==4 || eightcount==4 || ninecount==4 || tencount==4 || jackcount==4 || queencount==4 || kingcount==4 ||)
{
	println "Your hand contains a Poker" //four of the five cards have the same rank
}
else if (threerank && onepair)
{
	println "Your hand is a Full House" //three of a kind plus a pair
}
else if (samesuit)
{
	println "Your hand is a Flush" //all cards share the same suit, but their ranks are not consecutive
}
else if (cardsconsecutive)
{
	println "Your hand is a Straight" //the cards do not share the same suit, but all their ranks are consecutive
}
else if (three rank)
{
	println "Your hand contains Three of a Kind" //three of the cards have the same rank
}
else if (twopair)
{
	println "Your hand contains Two Pairs" //two pairs
}
else if (onepair)
{
	println "Your hand Contains One Pair" //two of the cards have the same rank
}
else
{
	println "Sorry your hand contains Nothing!"
}
 