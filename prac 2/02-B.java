import java.util.Scanner;
class Binary
{
	public static void main(String ar[])
	{
		int i=1,rem,no;
		int bn=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Decimal Number : ");
		no=s.nextInt();
		while(no>0)
		{
			rem=no%2;
			bn=bn+(rem*i);
			i=i*10;
			no=no/2;
		}
		System.out.println("Binary Number : "+bn);
	}
}