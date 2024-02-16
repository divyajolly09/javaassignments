package assignment9;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorEx {

	public static void main(String[] args) {

		ArrayList<String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Blue");
		a.add("violet");
		a.add("Pink");
		a.add("orange");
		System.out.println("the array list elements are:"+a);
		String i;
		Iterator<String> iterator = a.iterator(); 
		System.out.println("Array after itration is:");
		while (iterator.hasNext())  
		{  
		  i = iterator.next(); 
		  System.out.println(i);
		} 
		 
		// TODO Auto-generated method stub

	}

}
