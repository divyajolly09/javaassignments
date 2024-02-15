package assignment1;


public class Reverse1 {
	int n;
	int rev=0;
  public Reverse1(int n)
	{
		this.n=n;
		int rem;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
	}
	public Reverse1()
	{
		this(453);
		System.out.println("The reverse of the number is "+rev);
	}
	public static void main(String[] args) {
		Reverse1 a=new Reverse1();
		// TODO Auto-generated method stub
        
	}

}

