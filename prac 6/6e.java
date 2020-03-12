import java.util.*;
class NegNumException extends Exception
{
	public NegNumException(String s)
	{
		super(s);
	}
}
class Test
{
	public static void main(String arg[])
	{
		try
		{
			int num,sum=0;
			for(int i=0;i<arg.length;i++)
			{
				num=Integer.parseInt(arg[i]);
				if(num<0)
				{	
					throw new NegNumException ("Enter only Posiyive number");
				}
				sum=sum+num;
			}
			System.out.println("Sum:"+sum);
		}
		catch(NegNumException obj)
		{
			System.out.println(obj.getMessage());	
		}	
	}
}
		