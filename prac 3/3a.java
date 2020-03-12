import java.util.Scanner;
class Sort
{
	int i,j;
	void asec(int a[],int size)
	{
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Numbers In Ascending Order : \n");
		for(i=0;i<size;i++)
		{
			System.out.println("\t "+a[i]);
		}
	}
	void desc(int a[],int size)
	{
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Numbers In Ascending Order : \n");
		for(i=0;i<size;i++)
		{
			System.out.println("\t "+a[i]);
		}
	}
}

class TestSort
{
	public static void main(String args[])
	{
		int size,sm,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		size=s.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Number : ");
			num[i]=s.nextInt();
		}
		Sort s1=new Sort();
		s1.asec(num,size);
		s1.desc(num,size);
	}
}