package com.dairyproduct.valueadded;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static FileReader fr;
	public static Properties propFile() {
		File f=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\valueadded\\src\\main\\java\\nykaa.properties");
		
		try {
			fr = new FileReader(f);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Properties prop=new Properties();
		
		
		try {
			prop.load(fr); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return prop;
		
		
	}
}
