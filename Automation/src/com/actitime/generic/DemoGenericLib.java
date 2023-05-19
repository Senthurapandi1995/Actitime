package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
         FileLib f=new FileLib();
         String url = f.getPropertyData("url");
         System.out.println(url);
         System.out.println(f.getPropertyData("username"));
         System.out.println(f.getPropertyData("password"));
		 System.out.println(f.getExcelData("CreateCustomer", 1, 2));
		 f.setExcelData("CreateCustomer", 1, 4, "pass");
	}

}
