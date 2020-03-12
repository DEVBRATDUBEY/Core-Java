class Even extends Thread
{
	public void run()
	{
		try
		{
			for(int i=2;i<=20;i=i+2)
			{
				if(i==6)
				{
					System.out.println("Sleeping Thread Even");
					sleep(4000);
				}
				System.out.println("Even:"+i);
			}
		}
		catch(Exception e){}
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i=i+2)
		{
			System.out.println("Odd:"+i);
			if(i==11)
			{
				System.out.println("Thread Odd Stopped");
				stop();
			}
		}
	}
}
class LifeCycle
{
	public static void main(String ar[])
	{
		try
		{
			Even e=new Even();
			Odd o=new Odd();
			System.out.println("Starting Thread Even");
			e.start();
			System.out.println("Starting Thread Odd");
			o.start();
			System.out.println("Suspend Thread Even");
			e.suspend();
			System.out.println("Resume Thread Even");
			e.resume();
		}
		catch(Exception e){}
	}
}