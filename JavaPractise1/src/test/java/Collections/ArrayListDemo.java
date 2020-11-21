package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayListDemo {
	

	
	@Test
	public void ArrayListDemo() {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++) {
			
			al.add(i);
		}
		
		System.out.println(al);
		
		
		ListIterator<Integer> lt=al.listIterator();
		while(lt.hasNext()) {
			
			
			Integer q=lt.next();
			
			if(lt.hasPrevious()) {
				
				System.out.println("previous");
			}else {
				System.out.println("else came");
			}
		}
	}
}

