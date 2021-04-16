import java.util.Scanner;
class  FactorialWthRecursion{
	public static int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int num=scn.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));
	}
}
