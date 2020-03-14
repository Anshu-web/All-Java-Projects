package com.stream.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Used to write certain character/text to your file.
//================================
//// Java character streams are used to perform input and output of 16-bits unicode.
// Classes such as FileReader and FileWriter uses 2 bytes at a time.
//===========================================================================


public class CharacterApi {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * FileWriter out=null;
		 * 
		 * try { out=new FileWriter("input.txt"); out.write("Hello everyone to java"); }
		 * catch (IOException e) { e.printStackTrace(); } finally { out.close(); }
		 */
		
		
		//================================================
		
       FileReader in=null;
		
		try {
			in=new FileReader("input.txt");
			int c;
			while((c=in.read())!=-1)
			{
				System.out.println((char)(c));
			}
			 
		} catch (IOException e) {
 			e.printStackTrace();
		}
		finally {
			in.close();
		}
		
	}

}
