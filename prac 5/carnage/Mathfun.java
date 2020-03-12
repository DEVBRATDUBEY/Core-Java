package carnage;
public class Mathfun
{
	public int fact(int n)
	{
		int f=1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		return(f);
	}
	
	public boolean evenodd(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int pow(int m,int n)
	{
		int c=1;
		if(n==0)
		return(1);
		for(int i=1;i<n;i++)
		{
			c=c*m;
		}
		return(c);
	}
	public int rev(int n)
	{
		int s=0,r;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		return(s);
	}
}