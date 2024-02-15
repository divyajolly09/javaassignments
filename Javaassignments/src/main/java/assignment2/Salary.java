package assignment2;

public class Salary extends Calculation {
	int total;
	public void display()
	{
		total = (bp + hra + bonus)-(pf+deduction);
		System.out.println("\n********PAYSLIP********\n");
		System.out.println("Basic Pay: "+bp);
		System.out.println("HRA: "+hra);
		System.out.println("Deductions: "+deduction);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary is "+total);
	}

	public static void main(String[] args) {
		Salary s = new Salary();
		s.payslip();
		s.calc();
		s.display();
	}

}
