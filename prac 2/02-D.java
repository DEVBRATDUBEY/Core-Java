import java.util.Scanner;
class Stat
{
	static int cnt=0;
	void square(int n)
	{
		System.out.println("Square = "+(n*n));
		cnt++;
	}
}

class TestStat
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		Stat s1=new Stat();
		System.out.println("Enter Number : ");
		a=s.nextInt();
		s1.square(a);
		System.out.println("Object Created = "+Stat.cnt);
		Stat s2=new Stat();
		System.out.println("Enter Number : ");
		b=s.nextInt();
		s2.square(b);
		System.out.println("Object Created = "+Stat.cnt);
	}
}