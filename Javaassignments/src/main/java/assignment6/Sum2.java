package assignment6;

import java.util.Scanner;
public class Sum2 extends Sum 
{
	static int a,b,c;
	public int result(int a ,int b)
	{
		c = super.add(a, b);
		System.out.println("Sum is : "+c);
		return c;
		
	}

	public static void main(String[] args) {
		Sum2 s = new Sum2();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		a=obj.nextInt();
		b=obj.nextInt();
		c = s.result(a,b);
		if(c%10==0)
		{
			System.out.println("Sum is Divisible by 10");
		}
		else
		{
			System.out.println("Sum is Not Divisible by 10");
		}
		// TODO Auto-generated method stub

	}

}
