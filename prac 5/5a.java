
interface Shape
{
	float pi=3.14f;
	float area();
	float perimeter();
}
class Circle implements Shape
{
	int r;
	Circle(int r1)
	{
		r=r1;		
	}
	public float area()
	{
		return(pi*r*r);
	}
	public float perimeter()
	{
		return(2*pi*r);
	}
	
}
class Square implements Shape
{
	int s;
	Square(int s1)
	{
		s=s1;		
	}
	public float area()
	{
		return(s*s);
	}
	public float perimeter()
	{
		return(4*s);
	}
}
class Rect implements Shape
{
	int l,w;
	Rect(int l1,int w1)
	{
		l=l1;
		w=w1;
	}
	public float area()
	{
		return(l*w);
	}
	public float perimeter()
	{
		return(2*(l+w));
	}
}
class TestInt1
{
		public static void main(String ar[])
		{
			Circle c=new Circle(3);
			System.out.println("Area of Circle: "+c.area());
			System.out.println("Perimeter of Circle:"+c.perimeter());
			Square q=new Square(4);
			System.out.println("Area of Square: "+q.area());
			System.out.println("Perimeter of Circle: "+q.perimeter());
			Rect r=new Rect(5,4);
			System.out.println("Area of Rectangle"+r.area());
			System.out.println("Perimeter of Rectangle"+r.perimeter());
		}
}