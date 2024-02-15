package assignment5;

import assignment4.Student;
public class Address {
String address;
Student add;
public Address(String address,Student add)
{
	this.address=address;
	this.add=add;
	
}
public void display()
{
	System.out.println(add.name+" "+add.rollnumber+" ");
	System.out.println(address+"  ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Divya",1);
		Address a=new Address("North chempanoor p.o angamaly",s);
		a.display();

	}

}
