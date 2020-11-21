package Excel_Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelCollection {
	public void m2() {
		
		System.out.println("sai");
	}
	XSSFWorkbook workbook=null;
	XSSFSheet sheet=null;
	int k;

	ArrayList<String> al;
	ArrayList<String> al1;
	@Test
	public void excel() throws IOException {
		
	m2();
		try {
		
		 workbook=new XSSFWorkbook("C:\\Users\\Sai\\Downloads\\SampleData\\SampleData.xlsx");
		 LinkedHashMap<String,String> hash=new LinkedHashMap<String,String>();
		  al=new ArrayList<String>();
		  al1=new ArrayList<String>();

	 sheet=	workbook.getSheet("SalesOrders");
	 k=sheet.getLastRowNum();
	
	System.out.println(k+"row count-------");
	
	for(int i=1;i<=k;i++) {
		
		XSSFRow row=sheet.getRow(i);
		
		for(int j=2;j<=row.getLastCellNum();j++) {
			
			for(int m=3;m<=row.getLastCellNum();m++) {
			
			XSSFCell cell=row.getCell(j);
			XSSFCell cell1=row.getCell(m);

			 System.out.println(cell.getStringCellValue());
			String names= cell.getStringCellValue();
			String names2= cell1.getStringCellValue();

			//hash.put(names, names2);
			al.add(names);
			al1.add(names2);
			
			
		
			 break;
			
		}
			break;
		}
	}
	//System.out.println(hash);
	
	System.out.println(al);
	System.out.println(al1);
m1();
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			workbook.close();
		}
	}
	public void m1() {
		int l=0;
		for(int i=1;i<=k;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=2;j<=row.getLastCellNum();j++) {
				
				for(int m=3;m<=row.getLastCellNum();m++) {
				
				XSSFCell cell=row.getCell(j);
				XSSFCell cell1=row.getCell(m);

				// System.out.println(cell.getStringCellValue());
				String names= cell.getStringCellValue();
				System.out.println("first"+names);
				String names2= cell1.getStringCellValue();
				System.out.println("first2"+names2);
				
				if(al.size()==al1.size()) {
					
					for(int w=l;w<=al.size();w++) {
						
						for(int f=l;f<=al1.size();f++) {
							
							
							if(al.get(w).equals(names)&&al1.get(f).equals(names2)) {
								//System.out.println("contains");
								System.out.println(al.get(w)+"="+names+"======="+al1.get(f)+"="+names2+"-------------contains");
								break;
								
							}else {
								System.out.println("mismatch");
								break;
							}
							
						}
						break;
					}
					break;
				}

		
		
		
				}
				break;
		
	}
			
			l++;
}
	//	l++;
	}
}
