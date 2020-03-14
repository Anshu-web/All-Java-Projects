package com.string;

  public class DuplicatesMethod2
{
    public static void main(String nm,String w)
    {
        int l,i;
        int c=0;


        l=nm.length();
        String b="";

        for(i=0;i<l;i++)
        {
            char d=nm.charAt(i);
            if(d!=' ')
            {
                b=b+d;
            }
            if(d==' ')
            {
                if(b.compareTo(w)==0)
                {
                    c++;

                } 
               b="";           
            }        
        }       
        System.out.println(c);
    }
}