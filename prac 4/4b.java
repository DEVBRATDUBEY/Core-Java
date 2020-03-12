import java.util.Scanner;
class sinfo
{
	protected int rn=10;
	String sname;
	int m1,m2;
	void getinfo(String sname1,int rn1,int m11,int m22)
	{
		sname=sname1;
		rn=rn1;
		m1=m11;
		m2=m22;
	}
}

class marks extends sinfo
{
	int t,per;
	void calper()
	{
		t=m1+m2;
		per=(t*100)/200;
	}
}
class result extends marks
{
	void disresult()
	{
	System.out.println("Roll Number = "+rn+"\nNAME = "+sname);
	System.out.println("Marks 01 = "+m1+"\nMarks 02 = "+m2);
	
	if(m1<40 || m2<40)
	System.out.println("Result - Fail");
	else
	{
		System.out.println("Total = "+t);
		System.out.println("Percentage = "+per);
		if(per<60)
		System.out.println("Result - Pass Class");
		else if(per<75)
		System.out.println("Result - First Class");
		else
		System.out.println("Result - Distinct");
	}
	}
}

class DemoML
{
	public static void main(String []ar)
	{
		Scanner ss=new Scanner(System.in);
		int m1,r1,m2;
		String name;
		System.out.println("Enter Name : ");
		name=ss.nextLine();
		System.out.println("Enter Roll Number : ");
		r1=ss.nextInt();
		System.out.println("Enter Marks 01 : ");
		m1=ss.nextInt();
		System.out.println("Enter Marks 02 : ");
		m2=ss.nextInt();
		result r=new result();
		r.getinfo(name,r1,m1,m2);
		r.calper();
		r.disresult();
		sinfo s=new sinfo();
		System.out.println(s.rn);
	}
}