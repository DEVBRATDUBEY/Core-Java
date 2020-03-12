import java.util.*;
import java.io.*;
class Stud
{
	public static void main(String []arg)throws IOException
	{
		try
		{
			String name,add;
			int c,rn;
			FileWriter fw=new FileWriter("Student.txt",true);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Name: ");
			name=s.nextLine();
			System.out.println("Enter Address: ");
			add=s.nextLine();
			System.out.println("Enter Roll no: ");
			rn=s.nextInt();
			fw.write(rn);
			fw.write(add);
			fw.write(name);
			fw.write("\n");		
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("File is empty!");
		}
	}
}
			