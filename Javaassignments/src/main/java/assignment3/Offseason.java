package assignment3;
public class Offseason extends Onseason {
	public void discount()
	{
		super.discount();
		discount=(a*40)/100;
		System.out.println("Offseason discount on item is:"+discount);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Offseason o=new Offseason();
		o.discount();
	}
		
		

	}
