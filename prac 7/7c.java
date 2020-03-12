class Even extends Thread
{
	public void run()
	{
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println("Even:"+i);
		}
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println("Odd:"+i);
		}
	}
}
class Square extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Square:"+(i*i));
		}
	}
}
class Threads
{
	public static void main(String ar[])
	{
		Even e=new Even();
		Odd o=new Odd();
		Square s=new Square();
		e.start();
		o.start();
		s.start();
	}
}