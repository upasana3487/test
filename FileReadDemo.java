package Exception;

import java.io.*;

public class FileReadDemo  {

	public static void main(String[] args) 
			throws IOException
	{
		// TODO Auto-generated method stub
		
	File f = new File ("./upasana.txt");
		FileReader fr = new FileReader(f);
		int ch = fr.read();
		while(ch!=-1)
		{
		System.out.println((char)ch);
		ch=fr.read();
		}
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		fr.close();
		

	}

}
