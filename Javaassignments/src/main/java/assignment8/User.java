package assignment8;
import assignment7.Bank;
import java.util.Scanner;
public class User {
	static int a,amt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pin number: ");
		a=s.nextInt();
		Bank b=new Bank();
		b.setter(a);
		b.getter();
	}

}
