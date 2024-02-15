package assignment1;

public class Factorial {
int fact=1;
int n;
public void factorial(int n)
{
	this.n=n;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	this.display();
}
public void display()
{
	System.out.println(" factorial of the number is: "+fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Factorial f=new Factorial();
     f.factorial(5);
	}

}

