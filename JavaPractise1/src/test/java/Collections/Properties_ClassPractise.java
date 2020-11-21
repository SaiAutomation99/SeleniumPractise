package Collections;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties_ClassPractise {
	
	
	@Test
	public void propertiesPractise() {
		
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("properties.properties"));
			out.write("name:sai");
			out.newLine();
			out.write("name2:sai1");
			out.newLine();
			out.write("name3:sai3");
			out.flush();
			out.close();
			
		FileInputStream in=new FileInputStream("properties.properties");
		Properties pro=new Properties();
		pro.load(in);
		System.out.println(pro.getProperty("name"));
		
		System.out.println("sai");
		
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}
