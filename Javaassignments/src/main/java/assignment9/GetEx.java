package assignment9;

import java.util.ArrayList;

public class GetEx {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Blue");
		a.add("violet");
		a.add("Pink");
		a.add("orange");
		System.out.println("the array list elements are:"+a);
		
		String s=a.get(3);
		System.out.println("the element in 3rd index is:"+s);
	}
}
