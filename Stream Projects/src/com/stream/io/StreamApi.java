package com.stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Used to write certain bytes to your file

// Java byte streams are used to perform input and output of 8-bits bytes information.

//Since there are many classes related to byte stream but most frequently used classes are FileInpuStream and FileOutputStream

public class StreamApi {
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream in=null;
		FileOutputStream out=null;
		
		in=new FileInputStream("input.txt");// created the object of FileInputStream and reading the data from "input.txt"
		out=new FileOutputStream("output.txt");//created the object of FileOutputStream and writing the data to "output.txt"
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		
		System.out.println("File Copy is done");
		if(in!=null)
		{
			in.close();
		}
		if(out!=null)
		{
			out.close();
		}
	}

}
