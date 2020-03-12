import java.io.*;
class Read
{
	public static void main(String arg[])throws IOException
	{
		FileReader fr =new FileReader("student.txt");
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
		}
		fr.close();
	}
}