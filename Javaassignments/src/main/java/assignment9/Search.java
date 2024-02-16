package assignment9;

import java.util.ArrayList;

public class Search {

		public static void main(String[] args) {
			ArrayList<Integer>a=new ArrayList<Integer>();
			a.add(1);
			a.add(5);
			a.add(6);
			a.add(7);
			a.add(9);
			System.out.println("The elements are "+a);
			int b=a.indexOf(3);
			if(b==-1)
			{
				System.out.println("the searched  element is presnt");
			}
			else
			{
				System.out.println("not prsent");
			}
				
				
		// TODO Auto-generated method stub

	}

}
