package com.pattern;

public class MainApplication {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 BookShop bs=new BookShop();
		 bs.setShopName("Delta");
		 bs.LoadData();
		
		// bs.getBooks().remove(2);//This is doing the shallow cloning as the changes being made with
		                          // first object reflects the changes in cloned object as well.
		 
		                         //Hence will go for the deep cloning                 
		
		 //==============================================
		 
		 //After cloning
		 BookShop bs1=(BookShop) bs.clone();
		 bs.getBooks().remove(2);
		 
		 bs1.setShopName("Gama");
		 
		 System.out.println(bs);
		 System.out.println(bs1);
		 
		 
	}

}
