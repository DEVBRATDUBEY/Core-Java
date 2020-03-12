import java.util.Scanner;
class Add
{
		public static void main(String args[])
		{
			int rows,cols;
			int matrix1[][];
			int matrix2[][];
			int resmatrix[][];
			Scanner s= new Scanner(System.in);
			System.out.println("Enter number Of Rows : ");
			rows=s.nextInt();
			System.out.println("Enter Number Of Columns : ");
			cols=s.nextInt();
			matrix1= new int[rows][cols];
			System.out.println("Enter Elements For First Matrix : ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					matrix1[i][j]=s.nextInt();
				}
			}
			matrix2= new int[rows][cols];
			System.out.println("Enter Elements For Second Matrix : ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					matrix2[i][j]=s.nextInt();
				}
			}
			System.out.println("Matrix 01 : ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print("\t "+matrix1[i][j]);
				}
				System.out.println();
			}
			System.out.println("Matrix 02 : ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print("\t "+matrix2[i][j]);
				}
				System.out.println();
			}
			System.out.println("Resultant Matrix : ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print("\t "+(matrix1[i][j]+matrix2[i][j]));
				}
				System.out.println();
			}
		}
}
