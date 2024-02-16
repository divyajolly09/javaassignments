package collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList<>();
		l.add(9);
		l.add(6);
		l.add(8);
		l.add(9);
		System.out.println(l);
		
		int firstoccurence=l.indexOf(6);
		System.out.println(firstoccurence);
		int lastindex=l.lastIndexOf(9);
		System.out.println(lastindex);
		
		l.remove(2);
		System.out.println(l);
		
		int a=l.get(1);
		System.out.println(a);

	}

}

