import java.util.*;
class Rev
{
	public static void main(String [] agr)
	{
		String str,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Rev="+rev);
	}
}