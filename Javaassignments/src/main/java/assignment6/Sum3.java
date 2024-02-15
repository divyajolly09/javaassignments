package assignment6;

public class Sum3 extends Sum {
	 int c;
	public void result()
	{
		c=(super.add(5, 7));
		System.out.println(c);
		 if(c%10==0)
	     {
	    	 System.out.println("the number is divisible by 10");
	     }
	     else
	     {
	    	 System.out.println("not divisible by 10");
	     }
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sum3 s=new Sum3();
     s.result();
	}
}
