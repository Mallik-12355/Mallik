import java.util.Scanner;
class ReverseNumWthStrngBfr{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number to find reverse of the Number: ");
		int num=scn.nextInt();
		System.out.print("Original Number is: "+num);
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println();
		System.out.print("Reversed Number is: "+sb.reverse());
		System.out.println();
	}
}
