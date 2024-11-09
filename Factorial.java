//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Factorial
{
	public static long getFactorial( int num )
	{
        long total = 1;
        int i = 1;

        for(;i <= num;)
        {
            total *= i;
            i++;
        }
		long factorial= total;
        System.out.println(factorial);
        return factorial;
		
        
	}
}
