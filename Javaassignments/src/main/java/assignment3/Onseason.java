package assignment3;

import java.util.Scanner;

public class Onseason {
	int discount;
	int a;
	public void discount() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the price of an item: ");
		a=s.nextInt();
		discount=(a*15)/100;
		System.out.println("onseason discount on item is:"+discount);
	}
	

}

