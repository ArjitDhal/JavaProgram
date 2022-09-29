import java.io.*;
public class BufferDemo1
{
	public static void main(String args[])
	{
		try{
		BufferedOutputStream bos=new BufferedOutputStream(System.out);
		System.out.println("\nWrite the data on the buffered area.");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:/COREJAVA/July 28th 2020 CJ BATCH/C58/Sequence.java"));
		System.out.println("See the data of the buffer.\n");
		int ch=0;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
		}
		bis.close();
		bos.close();
		}catch(FileNotFoundException fe)
		{
			System.out.println("File Not Found.");
		}
		catch(IOException i)
		{
			System.out.println(i)
		}
	}
}
