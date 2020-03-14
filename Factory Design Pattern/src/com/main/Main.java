package com.main;

import com.pattern.AndroidOS;
import com.pattern.OS;

public class Main {
	
	public static void main(String[] args) {
		
		FactoryOperatingSystem fos=new FactoryOperatingSystem();
		OS os= fos.getInstance("closed");
		
	
		os.pecs();
		
		// OS s=new AndroidOS(0, null);
		 System.out.println(os);
		 
		 
		 
	}

}
