//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String go( String let, int size)
	{
		int i = 1;
        int j = 1;

		for(;i <= size; i++)
        {
            for(j=1;j <= i; j++)
            {
                System.out.print(let);

            }
            System.out.print("\n");
        }


		String output="";
		return output;
	}
}
