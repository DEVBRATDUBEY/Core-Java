import carnage.Mathfun;
import java.util.Scanner;
class Pack
{
	public static void main(String ar[])
	{
			Mathfun m=new Mathfun();
			Scanner s=new Scanner(System.in);
			int n,a,b,h;
			System.out.println("Enter no for factorial: ");
			n=s.nextInt();
			System.out.println("Fact=m.fact("+n+")="+m.fact(n));
			if(m.evenodd(n)==true)
			{
				System.out.println("m.evenodd("+n+")==Even");
			}
			else
			{
				System.out.println("m.evenodd("+n+")==Odd");
			}
			System.out.println("Enter no for power a and b: ");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("Pow=m.pow("+a+","+b+")="+m.pow(a,b));
			System.out.println("Enter no for reversing:");
			h=s.nextInt();
			System.out.println("Rev=m.rev("+h+")="+m.rev(h));
	}
}
	