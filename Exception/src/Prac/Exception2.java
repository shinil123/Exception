package Prac;

public class Exception2 {

	public static void main(String[] args) 
	{	
		try
		{
			int n=11;
			check(n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void check(int n) throws Exception
	{
		if(n%2==0)
		{
			System.out.println("Yes its even");
		}
		else
		{
			throw new Exception("Its an error");
		}
	}

}
