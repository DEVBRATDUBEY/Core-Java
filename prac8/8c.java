import java.io.*;
class CopyFile
{
	public static void main(String[] arg)throws IOException
	{
		try
		{
			FileReader in=new FileReader("student.txt");
			FileWriter out=new FileWriter("stu.txt");
			int c;
			char ch;
			while((c=in.read())!=-1)
			{
				ch=(char)c;
				System.out.print(ch);
				out.write(c);
			}
			in.close();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
			
	