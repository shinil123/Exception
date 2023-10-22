package Prac;

public class Exception1 {

	public static void main(String[] args) 
	{
		try
		{
			int result=divide(51,0);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int a,int b) throws Exception
	{
		if(b==0)
		{
			throw new Exception("not possible");
		}
		return a/b;
	}

}
