//Ex3x16 - not yet tested
boolean cmdquit = false, cmdmail = false, cmdrcpt = false, cmddata = false
int str1len = 0, str2len = 0, emailtextlen = 0
String str1 = "", str2 = "", str3 = "", str4 = "", emailtext = ""
while (!cmdquit)
{
	while (!(cmdmail || cmdquit))
	{
		print ">>> "
		str1 = System.console().readLine()
		str1len = str1.length()
		if (str1.substring(0,4) == "QUIT")
		{
			cmdquit = true
		}
		else if (str1.substring(0,11) == "MAIL FROM: "
		{
			for (int i = 12; i <= (str1len-2); i++)
			{
				if (str1.substring(i,i+1) == "@"
				{
					cmdmail = true
				}
			}
			if (!cmdmail)
			{
				println "Invalid email address"
			}
		}
		else
		{
			println "Invalid command."
		}
	}
	if (!cmdquit)
	{
		while (!(cmdrcpt || cmdquit))
		{
			print ">>> "
			str2 = System.console().readLine()
			str2len = str2.length()
			if (str2.substring(0,4) == "QUIT")
			{
				cmdquit = true
			}
			else if (str2.substring(0,9) == "RPCT TO: "
			{
				for (int j = 10; j <= (str2len-2); j++)
				{
					if (str2.substring(j,j+1) == "@"
					{
						cmdrcpt = true
					}
				}
				if (!cmdrcpt)
				{
					println "Invalid email address"
				}
			}
			else
			{
				println "Invalid command."
			}
		}	
	}
	if (!cmdquit)
	{
		while (!(cmddata || cmdquit))
		{
			print ">>> "
			str3 = System.console().readLine()
			if (str3.substring(0,4) == "QUIT")
			{
				cmdquit = true
			}
			else if (str3.substring(0,4) == "DATA"
			{
				while (!cmddata)
				{
					str4 = System.console().readLine()
					if (str4 == ".")
					{
						cmddata=true
					}
					else
					{
						emailtext = emailtext + str4 + "/n"
					}
				}
				println "Sending email..."
				println "from: " + str1.substring(11,str1len-1)
				println "to: " + str2.substring(9,str2len-1)
				println "from: " + str1.substring(11,str1len-1)
				emailtextlen = emailtext.length()
				for (int k=0; k<= emailtextlen-1, k++)
				{					
					println emailtext.substring(k,k+1)
				}
				println "...done!"
			}
			else
			{
				println "Invalid command."
			}
		}
	}
}
println "Bye!"


		