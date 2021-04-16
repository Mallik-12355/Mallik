import java.util.Scanner;
class ReverseNum{
	static int rev(int n){
		int r=0;
		while(n>0){
			r=r*10+n%10;
			n=n/10;
		}
		return r;
	}
	public static void main(String[] args)	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number to find reverse of the Number: ");
		int num=scn.nextInt();
		System.out.print("Original Number is: "+num);
		System.out.println();
		System.out.print("Reversed Number is: "+rev(num));
		System.out.println();
	}
}
