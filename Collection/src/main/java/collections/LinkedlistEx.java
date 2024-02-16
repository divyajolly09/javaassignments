package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("divya");  
		  al.add("jolly");  
		
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
	}
		//  LinkedList<String> obj=new LinkedList<String>();    
           
          al.add(1, "dhanya");  
          System.out.println(al); 
          
         al.remove("divya");
          System.out.println(al);
          
          
          
          Iterator i=al.descendingIterator();  
          while(i.hasNext())  
          {  
              System.out.println(i.next());  
          }  
         
          al.clear();
          System.out.println(al);
          
}
}
