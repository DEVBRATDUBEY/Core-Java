import java.util.Scanner;
abstract class Shape
{
	float x,y;
	void getd(float x1,float y1)
	{
		x=x1;
		y=y1;
	}
	abstract void area();
}

class Triangle extends Shape
{
	public void area()
	{
		System.out.println("Area Of Triangle = "+(x*y)/2);
	}
}

class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("Area Of Rectangle = "+(x*y));
	}
}

class HI
{
	public static void main(String ar[])
	{
		float b,h,len,wid;
		Scanner s=new Scanner(System.in);
		Triangle t=new Triangle();
		System.out.println("Enter Base And Height For Triangle : ");
		b=s.nextFloat();
		h=s.nextFloat();
		t.getd(b,h);
		t.area();
		System.out.println("Enter Length And Width For Rectangle : ");
		len=s.nextFloat();
		wid=s.nextFloat();
		Rectangle r=new Rectangle();
		r.getd(len,wid);
		r.area();
	}
}
