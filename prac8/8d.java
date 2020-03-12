import java.io.*;
class imagcopy
{
	public static void main(String []arg)throws IOException
	{
		try
		{
			FileInputStream in=new FileInputStream("download.png");
			FileOutputStream out=new FileOutputStream("pop.png");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Image Copied");
	}
}