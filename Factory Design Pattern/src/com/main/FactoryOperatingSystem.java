package com.main;

import com.pattern.AndroidOS;
import com.pattern.IOS;
import com.pattern.OS;
import com.pattern.WindowsOS;

public class FactoryOperatingSystem {
	
public OS getInstance(String str)
{
	if(str.equals("open"))
	{
		return new AndroidOS(12, "Samsung");
	}
	else if(str.equals("closed"))
	{
		return new WindowsOS();
	}
	else
	{
		return new IOS(14, "Apple");
	}
}

}
