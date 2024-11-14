//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class CoolNumbers 
{

	public static boolean isCoolNumber( int num )
	{
        if(num%3 == 1 && num%4 == 1 && num%5 == 1 && num%6 == 1)
        {
			return true;
        }
		else{
			return false;
		}


	}
	
	
	public static int countCoolNumbers( int stop )

	{
		int count = 0;

		for(int i = 6; i <= stop ; i++)
        {
			boolean j = CoolNumbers.isCoolNumber(i);

			if(j == true)
			{
				count++;
			}
			else{
				count += 0;
			}
        }
		return count;
		
	}
}
