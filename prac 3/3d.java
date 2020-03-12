import java .util.Scanner;
class Mult
{
	public static void main(String args[])
	{
		int m,n,p,q,sum=0,c,d,k;
		Scanner in=new Scanner(System.in);
		System.out.println("\t\t\tFIRST MATRIX");
		System.out.println("Enter The Number Of Rows : ");
		m=in.nextInt();
		System.out.println("Enter The Number Of Columns : ");
		n=in.nextInt();
		int first[][]=new int[m][n];
		System.out.println("Enter Elements : ");
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d]=in.nextInt();
		System.out.println("\t\t\tSECOND MATRIX");
		System.out.println("Enter The Number Of Rows : ");
		p=in.nextInt();
		System.out.println("Enter The Number Of Columns : ");
		q=in.nextInt();
		if(n!=p)
			System.out.println("Matrices With Entered Orders Can't Be Multiplied With Each Other .");
		else
		{
			int second[][]=new int[p][q];
			int multiply[][]=new int[m][q];
			System.out.println("Enter Elements : ");
			for(c=0;c<p;c++)
				for(d=0;d<q;d++)
					second[c][d]=in.nextInt();
			for(c=0;c<m;c++)
			{
				for(d=0;d<m;d++)
				{
					for(k=0;k<p;k++)
					{
						sum=sum+first[c][k]*second[k][d];
					}
					multiply[c][d]=sum;
					sum=0;
				}
			}
			System.out.println("\t\t\tPRODUCT MATRIX");
			for(c=0;c<m;c++)
			{
				for(d=0;d<q;d++)
					System.out.print(multiply[c][d]+"\t");
				System.out.print("\n");

			}
		}
	}
}