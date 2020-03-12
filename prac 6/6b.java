import java.util.*;
class StrCount
{
	public static void main(String arg[])
	{
			String str;
			int chr=0,sp=0,num=0,oc=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a String: ");
			str=s.nextLine();
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if((ch>=65 && i<=90) || (ch>=97 && ch<=122))
					chr=chr+1;
				else if(ch>=47 && ch<=58)
					num++;
				else if(ch==32)
					sp=sp+1;
				else
					oc=oc+1;
			}
			System.out.println("Alpahabet = "+chr);
			System.out.println("Num = "+chr);
			System.out.println("Spaces = "+chr);		
			System.out.println("Other char = "+chr);
	}
}