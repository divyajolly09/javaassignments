package collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String>l=new ArrayList<>();
		l.add("red");
		l.add("pink");
		l.add("green");
		System.out.println(l);
		// TODO Auto-generated method stub
		l.set(0,"violet");
		System.out.println(l);
		
		Boolean a=l.contains("pink");
		System.out.println(a);
		

	}

}
