import java.util.Scanner;
class Decimal
{
	public static void main(String ar[])
	{
		int i=0,rem,no;
		double dn=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Binary Number : ");
		no=s.nextInt();
		while(no>0)
		{
			rem=no%10;
			dn=dn+(rem*Math.pow(2,i));
			i=i+1;
			no=no/10;
		}
		System.out.println("Decimal Number : "+dn);
	}
}