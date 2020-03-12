class Sort
{
  public static void main(String arg[])
  {
    for(int i=0;i<arg.length;i++)
	{
	    for(int j=i+1;j<arg.length;j++)
		{
		   if(arg[i].compareTo(arg[j])>0)
		   {
		       String temp=arg[i];
			   arg[i]=arg[j];
			   arg[j]=temp;
			}
		}
	}
	for(int i=0;i<arg.length;i++)
	{
	   System.out.println(arg[i]);
	}
  }
}