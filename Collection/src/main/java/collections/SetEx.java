package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer>s=new LinkedHashSet<Integer>();
      s.add(5);
      s.add(8);
      s.add(7);
      System.out.println(s);
      System.out.println("hash code is: "+s.hashCode());
      
      
      
      Set<Integer>s6=new LinkedHashSet<Integer>();
      s6.add(5);
      s6.add(8);
      s6.add(45);
      
     s.removeAll(s6);
     System.out.println(s);
     
      s.retainAll(s6);
      System.out.println("set after reatining new elements are"+s);
      
      
     
     
      s6.remove(8);
      System.out.println("set after removal: "+s6);
     
      
      Iterator s5 =s6.iterator();  
      System.out.println("The NewData values are: ");   
      while(s5.hasNext())
      {   
          System.out.println(s5.next());
      }
      
     
      Set<Integer>s1=new LinkedHashSet<Integer>();
      s1.add(9);
      s.addAll(s1);
      System.out.println(s);
      
      s.clear();   
      System.out.println("The final set: " +s);
      
      Set<String>s2=new LinkedHashSet<String>();
      s2.add("pink");
      s2.add("blue");
      System.out.println(s2);
      
      boolean a=  s2.contains("blue");
      System.out.println(a);
      boolean b=s2.isEmpty();
      System.out.println("is list is empty: "+b);
      
      
      Set<String>s3=new LinkedHashSet<String>();
      s3.add("pink");
      s3.add("blue");

      
     boolean c= s2.containsAll(s3);
      System.out.println(c);
      
      Set<Integer> d = new LinkedHashSet<Integer>();   
      d.add(31);   
      d.add(21);   
      d.add(41);  
      d.add(91);   
      d.add(71);   
      d.add(81);         
      System.out.println("data: " + d);  
        
      System.out.println("size of the data is : " + d.size());       
  }   
      
      
      
   

}

