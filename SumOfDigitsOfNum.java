import java.util.Scanner;
class SumOfDigitsOfNum{
	static int sum(int n){
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number to Find Sum of its Digits: ");
		int num=scn.nextInt();
		System.out.println();
		System.out.print("The Given Number is: "+num);
		System.out.println();
		System.out.print("Sum of Digits of Given Number is: "+sum(num));
		System.out.println();
	}
}
