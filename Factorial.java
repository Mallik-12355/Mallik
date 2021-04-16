import java.util.Scanner;
class Factorial{
	void fact(int x){
		int fact=x;
		for(int i=x-1;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("factorial of given number is "+fact);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Factorial f1=new Factorial();
		System.out.print("Enter a number: ");
		f1.fact(scn.nextInt());		
	}
}
