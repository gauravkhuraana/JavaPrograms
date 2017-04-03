package javaPractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	
	
	public static void main(String[] args) throws IOException
	{
		FileReader fr =  new FileReader("D:\\software\\read.txt");
		BufferedReader br =  new BufferedReader(fr);
		StringBuffer str=new StringBuffer();
				try
				{
				while(br.readLine()!=null)
				{
					str.append(br.readLine());
					str.append("\n");
					//int y=10/0;
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		
		System.out.println(" Below is the content for the file");
		System.out.println(str);
		
	}
}
