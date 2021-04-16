import java.util.Scanner;
class ReverseNumWthStrngBldr{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number to find reverse: ");
		int num=scn.nextInt();
		System.out.print("Original Number is: "+num);
		System.out.println();
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.print("Reversed Number is: "+sb.reverse());
		System.out.println();
	}
}
