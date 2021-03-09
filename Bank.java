import java.util.Scanner;
class Bank{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);

		/*Object 1 creation using 0-parameter Constructor.*/
		BankAccount acc1=new BankAccount();
		System.out.println("Enter object 1 values:");

		System.out.print("Enter Account Number:");
		acc1.setAccNum(scn.nextLong()); scn.nextLine();		
		System.out.print("Enter Account Holder Name:");
		acc1.setAccHname(scn.nextLine());
		System.out.print("Enter Account Balance:");
		acc1.deposit(scn.nextDouble()); scn.nextLine();
		System.out.println();
//=========================================================================		
		
		System.out.println("Enter object 2 values:");

		System.out.print("Enter Account Number:");
		BankAccount acc2=new BankAccount(scn.nextLong()); scn.nextLine();
		System.out.print("Enter Account Holder Name:");
		acc2.setAccHname(scn.nextLine());
		System.out.print("Enter Account Balance:");
		acc2.deposit(scn.nextDouble()); scn.nextLine();
		System.out.println();
//=========================================================================		
		
		System.out.println("Enter object 3 values:");

		System.out.print("Enter Account Number:");
		long accNum=scn.nextLong(); scn.nextLine();
		System.out.print("Enter Account Holder Name:");
		String accHname=scn.nextLine();
		System.out.print("Enter balance:");
		double balance=scn.nextDouble();

		BankAccount acc3=new BankAccount(accNum,accHname,balance);

		System.out.println("acc1 values:");
		acc1.display();
		System.out.println("acc2 values:");
		acc2.display();
		System.out.println("acc3 values:");
		acc3.display();
	}
}
