//Ex3x16 - not yet tested
//QUIT works! MAIL FROM almost works! RCPT TO almost works! DATA almost works! Hangs at end tho'
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
		if (str1len == 4 && str1.substring(0,4) == "QUIT")
			{
				cmdquit = true
			}
		else if (str1len >= 11)
		{
			if (str1.substring(0,11) == "MAIL FROM: ")
			{
				if (str1len >= 14)
				{
					for (int i = 12; i <= (str1len-2); i++)
					{
						if (str1.substring(i,i+1) == "@")
						{
							cmdmail = true
						}
					}
				}
				if (cmdmail)
				{
					println "OK"
				}
				else
				{
					println "Invalid email address"
				}			
			}
		}
		else
		{
			println "Invalid command."
		}
	}
//OKish to here?	
	if (!cmdquit)
	{
		while (!(cmdrcpt || cmdquit))
		{
			print ">>> "
			str2 = System.console().readLine()
			str2len = str2.length()
			if (str2len == 4 && str2.substring(0,4) == "QUIT")
			{
				cmdquit = true
			}
			else if (str2len >= 9)
			{
				if (str2.substring(0,9) == "RPCT TO: ")
				{
					if (str2len >= 12)
					{
						for (int j = 10; j <= (str2len-2); j++)
						{
							if (str2.substring(j,j+1) == "@")
							{
								cmdrcpt = true
							}
						}
					}
					if (cmdrcpt)
					{
						println "OK"
					}
					else
					{
						println "Invalid email address"
					}
				}
			}
			else
			{
				println "Invalid command."
			}
		}
	}
//OKish to here?


	if (!cmdquit)
	{
		while (!(cmddata || cmdquit))
		{
			print ">>> "
			str3 = System.console().readLine()
			str3len = str3.length()
			if (str3len == 4)
			{
				if (str3.substring(0,4) == "QUIT")
				{
					cmdquit = true
				}
				else if (str3.substring(0,4) == "DATA")
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
							emailtext = emailtext + str4 + "#"
						}
					}
					println "Sending email..."
					println "from: " + str1.substring(11,str1len)
					println "to: " + str2.substring(9,str2len)
					emailtextlen = emailtext.length()
					for (int k=0; k<= emailtextlen-1; k++)
					{
						if (substring(k,k+1) == "#")
						{
							println ""
						}
						else
						{
							print emailtext.substring(k,k+1)
						}
					}
					println ""
					println "...done!"
				}
			}
			else
			{
				println "Invalid command."
			}
		}
	}
}
println "Bye!"


		