package assignment7;
import java.util.Scanner;

public class Bank {
	private int pin;
	 int amt;
	 int balance=20000;
	public void setter(int pin)
	{
		this.pin=pin;
	}
   public void getter()
   {
	   if((pin==1001)||(pin==1234) ||(pin==1212))
	   {
		   System.out.println("Pin number is valid: "+pin);
		   this.withdrawl();
	   }
	   else
	   {
		   System.out.println("INVALID PIN");
	   }
   }
   public void withdrawl()
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the amount that you want to withdraw: ");  
       amt = s.nextInt();  
       if (balance >= amt) {  
           balance = balance - amt;  
           System.out.println("Balance after withdrawal: " + balance);  
       } else {  
           System.out.println("Your balance is less than entered amount" + amt );  
       }  
   }
}

