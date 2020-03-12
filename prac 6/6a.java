class Str
{
	public static void main(String[] arg)
	{
		char ar[]={4,2,3,0,5};
		long s=sum(ar,5);
		System.out.println("Sum="+s);
	}
	public static long sum(char ar[],int l)
	{
		int s=0;
		for(int i=0;i<5;i++)
		{
			s=s+(int)ar[i];
		}
		return(s);
	}
}