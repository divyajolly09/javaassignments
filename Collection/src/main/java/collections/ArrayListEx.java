package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<String>();
		s.add("red");
		s.add("blue");
		s.add("pink");
		System.out.println(s);
		s.add(3,"yellow");
		System.out.println(s);
		ArrayList<String>s1=new ArrayList<String>();
		s1.add("violet");
		s.addAll(s1);
		System.out.println(s);
		boolean a=s.contains("red");
		if(a)
		{
			System.out.println("red is there");
		}
		else
		{
			System.out.println("not there");
		}
		System.out.println(s.get(2));
		// TODO Auto-generated method stub
         boolean b=s.isEmpty();
         if(b==true)
         {
        	 System.out.println("list is empty");
         }
         else
         {
        	 System.out.println("not empty");
         }
         s.remove(0);
         System.out.println(s);
         System.out.println(s.size());
         }
	}

