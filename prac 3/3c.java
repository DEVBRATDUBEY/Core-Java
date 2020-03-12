import java.util.*;
class SL
{
	public static void main(String ar[])
	{
		int size,sm,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		size=s.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Number : ");
			num[i]=s.nextInt();
		}
		sm=num[0];
		l=num[0];
		for(int i=0;i<size;i++)
		{
			if(num[i]<sm)
				sm=num[i];
			if(num[i]>sm)
				l=num[i];	
		}
		System.out.println("Smallest Number : "+sm);
		System.out.println("Lagrest Number : "+l);
	}
}