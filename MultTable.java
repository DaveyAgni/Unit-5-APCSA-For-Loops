//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int n, int s)
	{
        stop = s;
        number = n;
	}

	public void printTable()
	{
        int i = 1;
        System.out.println("multiplication table for" + number);

        for (;i <= stop; i++)
        {
            int result = number * i;
            String finalResult = number + "  " + result;
            System.out.println(finalResult);
        }
	}
}
